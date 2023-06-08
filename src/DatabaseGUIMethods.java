import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class DatabaseGUIMethods {

    public static void fetchEntries(JTable table) {
        DefaultTableModel model = new DefaultTableModel();

        try (Connection connection = DriverManager.getConnection(DatabaseGUI.getURL(), DatabaseGUI.getUsername(), DatabaseGUI.getPassword())) {
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
                    DatabaseGUI.nextId = idResultSet.getInt(1) + 1;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        table.setModel(model);
    }

    public static void addEntry(int nextId, JTable table) {
        String name = JOptionPane.showInputDialog(null, "Enter a name:");
        if (name == null || name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Invalid name. Entry not added.");
            return;
        }

        try (Connection connection = DriverManager.getConnection(DatabaseGUI.getURL(), DatabaseGUI.getUsername(), DatabaseGUI.getPassword())) {
            try (Statement statement = connection.createStatement()) {
                // Insert data
                String insertDataQuery = "INSERT INTO accounts VALUES (" + nextId + ", '" + name + "', 100, 0, 0, 0)";
                statement.executeUpdate(insertDataQuery);
                JOptionPane.showMessageDialog(null, "Entry added successfully.");

                // Refresh table
                fetchEntries(table);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error adding entry to the database.");
        }
    }

    public static void clearDatabase(JTable table) {
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear the database?", "Confirm Clear", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try (Connection connection = DriverManager.getConnection(DatabaseGUI.getURL(), DatabaseGUI.getUsername(), DatabaseGUI.getPassword())) {
                try (Statement statement = connection.createStatement()) {
                    String clearQuery = "DELETE FROM accounts";
                    statement.executeUpdate(clearQuery);
                    JOptionPane.showMessageDialog(null, "Database cleared successfully.");
                    fetchEntries(table); // Refresh the table
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error clearing the database.");
            }
        }
    }

    public static void returnToMainMenu() {
        CasinoMainGUI cmgui = new CasinoMainGUI();
        cmgui.setVisible(true);
    }

    public static void updateActiveSave(JTextField activeSaveField) {
        String activeSaveText = activeSaveField.getText();
        if (activeSaveText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a valid active save value.");
            return;
        }

        try {
            int newActiveSave = Integer.parseInt(activeSaveText);
            DatabaseGUI.activeSave = newActiveSave;
            JOptionPane.showMessageDialog(null, "Active save updated to: " + DatabaseGUI.activeSave);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid active save value. Please enter a valid number.");
        }
    }
}
