import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public static int nextId = 1; // Next ID for the new entry
    public static Integer activeSave = 1; // Active save ID

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
        DatabaseGUIMethods.fetchEntries(table);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DatabaseGUIMethods.addEntry(nextId, table);
                nextId++;
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DatabaseGUIMethods.clearDatabase(table);
            }
        });

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DatabaseGUIMethods.returnToMainMenu();
                dispose();
            }
        });

        updateSaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DatabaseGUIMethods.updateActiveSave(activeSaveField);
            }
        });

        setVisible(true);
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
