
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class DatabaseWriter {

    public static void updateBalance(int activeSave, int balance) {
        try (Connection connection = DriverManager.getConnection(Database.getURL(), Database.getUsername(), Database.getPassword())) {
            String query = "UPDATE accounts SET balance = ? WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, balance);
                statement.setInt(2, activeSave);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updatePointsWon(int activeSave, int pointsWon) {
        try (Connection connection = DriverManager.getConnection(Database.getURL(), Database.getUsername(), Database.getPassword())) {
            String query = "UPDATE accounts SET pointsWon = ? WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, pointsWon);
                statement.setInt(2, activeSave);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updatePointsLost(int activeSave, int pointsLost) {
        try (Connection connection = DriverManager.getConnection(Database.getURL(), Database.getUsername(), Database.getPassword())) {
            String query = "UPDATE accounts SET pointsLost = ? WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, pointsLost);
                statement.setInt(2, activeSave);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void increaseGamesPlayed(int activeSave) {
        try (Connection connection = DriverManager.getConnection(Database.getURL(), Database.getUsername(), Database.getPassword())) {
            String query = "UPDATE accounts SET gamesPlayed = gamesPlayed + 1 WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, activeSave);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void resetStats(int activeSave) {
        try (Connection connection = DriverManager.getConnection(Database.getURL(), Database.getUsername(), Database.getPassword())) {
            String query = "UPDATE accounts SET balance = 100, pointsWon = 0, pointsLost = 0, gamesPlayed = 0 WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, activeSave);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addEntry(int nextId, JTable table) {
        String name = JOptionPane.showInputDialog(null, "Enter a name:");
        if (name == null || name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Invalid name. Entry not added.");
            return;
        }
        try (Connection connection = DriverManager.getConnection(Database.getURL(), Database.getUsername(), Database.getPassword())) {
            try (Statement statement = connection.createStatement()) {
                // Insert data
                String insertDataQuery = "INSERT INTO accounts VALUES (" + nextId + ", '" + name + "', 100, 0, 0, 0)";
                statement.executeUpdate(insertDataQuery);
                JOptionPane.showMessageDialog(null, "Entry added successfully.");
                // Refresh table
                Database.fetchEntries(table);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error adding entry to the database.");
        }
    }

    public static void clearDatabase(JTable table) {
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear the database?", "Confirm Clear", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try (Connection connection = DriverManager.getConnection(Database.getURL(), Database.getUsername(), Database.getPassword())) {
                try (Statement statement = connection.createStatement()) {
                    String clearQuery = "DELETE FROM accounts";
                    statement.executeUpdate(clearQuery);
                    JOptionPane.showMessageDialog(null, "Database cleared successfully.");
                    Database.fetchEntries(table); // Refresh the table
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error clearing the database.");
            }
        }
    }
}
