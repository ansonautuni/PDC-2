
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class DatabaseGUI extends JFrame {

    static final String URL = "jdbc:derby:mydatabase";
    static final String USERNAME = "anson";
    static final String PASSWORD = "anson";

    private JTable table;
    private JButton addButton;
    private JButton clearButton;
    private JButton returnButton;
    private JTextField activeSaveField;
    private JButton updateSaveButton;

    private int nextId = 1; // Next ID for the new entry
    private static Integer activeSave = 1; // Active save ID

    public DatabaseGUI() {
        setTitle("Database Entries");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400);
        setLocationRelativeTo(null);

        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.LINE_AXIS));

        addButton = new JButton("Add Entry");
        clearButton = new JButton("Clear Database");
        returnButton = new JButton("Return to Main Menu");
        activeSaveField = new JTextField(10);
        updateSaveButton = new JButton("Update Active Save");

        inputPanel.add(activeSaveField);
        inputPanel.add(updateSaveButton);
        inputPanel.add(Box.createHorizontalGlue());
        inputPanel.add(addButton);
        inputPanel.add(clearButton);
        inputPanel.add(returnButton);

        getContentPane().add(inputPanel, BorderLayout.SOUTH);

        // Fetch and display data
        fetchEntries();

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addEntry();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearDatabase();
            }
        });

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                returnToMainMenu();
            }
        });

        updateSaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateActiveSave();
            }
        });

        setVisible(true);
    }

    private void fetchEntries() {
        DefaultTableModel model = new DefaultTableModel();

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            try (Statement statement = connection.createStatement()) {
                ResultSet resultSet = statement.executeQuery("SELECT id, name, balance, pointsWon, pointsLost, (pointsWon - pointsLost) AS netEarnings, gamesPlayed FROM accounts");

                // Get column names from the result set metadata
                ResultSetMetaData metaData = resultSet.getMetaData();
                int columnCount = metaData.getColumnCount();
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    model.addColumn(columnName);
                }

                // Add rows to the model
                while (resultSet.next()) {
                    Object[] row = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        row[i - 1] = resultSet.getObject(i);
                    }
                    model.addRow(row);
                }

                // Get the next ID
                ResultSet idResultSet = statement.executeQuery("SELECT MAX(id) FROM accounts");
                if (idResultSet.next()) {
                    nextId = idResultSet.getInt(1) + 1;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        table.setModel(model);
    }

    private void addEntry() {
        String name = JOptionPane.showInputDialog(this, "Enter a name:");
        if (name == null || name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invalid name. Entry not added.");
            return;
        }

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            try (Statement statement = connection.createStatement()) {
                // Insert data
                String insertDataQuery = "INSERT INTO accounts VALUES (" + nextId + ", '" + name + "', 100, 0, 0, 0)";
                statement.executeUpdate(insertDataQuery);
                JOptionPane.showMessageDialog(this, "Entry added successfully.");

                // Refresh table and increment the next ID
                fetchEntries();
                nextId++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error adding entry to the database.");
        }
    }

    private void clearDatabase() {
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to clear the database?", "Confirm Clear", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
                try (Statement statement = connection.createStatement()) {
                    String clearQuery = "DELETE FROM accounts";
                    statement.executeUpdate(clearQuery);
                    JOptionPane.showMessageDialog(this, "Database cleared successfully.");
                    fetchEntries(); // Refresh the table
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error clearing the database.");
            }
        }
    }

    private void returnToMainMenu() {
        CasinoMainGUI cmgui = new CasinoMainGUI();
        cmgui.setVisible(true);
        dispose();
    }

    private void updateActiveSave() {
        String activeSaveText = activeSaveField.getText();
        if (activeSaveText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a valid active save value.");
            return;
        }

        try {
            int newActiveSave = Integer.parseInt(activeSaveText);
            activeSave = newActiveSave;
            JOptionPane.showMessageDialog(this, "Active save updated to: " + activeSave);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid active save value. Please enter a valid number.");
        }
    }

    public static Integer getActiveSave() {
        return activeSave;
    }

    public static String getURL() {
        return URL;
    }

    public static String getUsername() {
        return USERNAME;
    }

    public static String getPassword() {
        return PASSWORD;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DatabaseGUI databaseGUI = new DatabaseGUI();
            if (databaseGUI.activeSave == null) {
                String id = JOptionPane.showInputDialog(databaseGUI, "Enter an ID to make it active:");
                if (id != null) {
                    try {
                        databaseGUI.activeSave = Integer.parseInt(id);
                        JOptionPane.showMessageDialog(databaseGUI, "Active save set to ID: " + databaseGUI.activeSave);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(databaseGUI, "Invalid ID.");
                    }
                }
            }
        });
    }
}
