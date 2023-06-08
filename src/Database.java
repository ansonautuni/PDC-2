
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class Database {

    static final String URL = "jdbc:derby:savefiledb";
    static final String PASSWORD = "anson";
    static final String USERNAME = "anson";
    public static Integer activeSave = null; // Active save ID

    public static void fetchEntries(JTable table) {
        DefaultTableModel model = new DefaultTableModel();

        try (Connection connection = DriverManager.getConnection(getURL(), getUsername(), getPassword())) {
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
        }
        table.setModel(model);
    }

    public static void returnToMainMenu() {
        CasinoGUI cmgui = new CasinoGUI();
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
            activeSave = newActiveSave;
            JOptionPane.showMessageDialog(null, "Active save updated to: " + activeSave);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid active save value. Please enter a valid number.");
        }
    }

    public static String getURL() {
        return Database.URL;
    }

    public static Integer getActiveSave() {
        return Database.activeSave;
    }

    public static String getPassword() {
        return Database.PASSWORD;
    }

    public static String getUsername() {
        return Database.USERNAME;
    }
}
