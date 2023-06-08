
import java.sql.*;

public class DatabaseReader {

    // method to check if there is an entry matching the active save and database
    public static boolean hasEntry() {
        boolean hasEntry = false; 
        Integer activeSave = Database.getActiveSave();

        if (activeSave != null) {
            try (Connection connection = DriverManager.getConnection(Database.getURL(), Database.getUsername(), Database.getPassword())) {
                try (Statement statement = connection.createStatement()) {
                    String query = "SELECT COUNT(*) AS count FROM accounts WHERE id = " + activeSave;
                    ResultSet resultSet = statement.executeQuery(query);
                    if (resultSet.next()) {
                        int count = resultSet.getInt("count");
                        hasEntry = count > 0;
                    }
                }
            } catch (SQLException e) {
            }
        }
        return hasEntry;
    }

    // method to get the name of the activesave
    public static String getName() {
        String name = "";
        Integer activeSave = Database.getActiveSave();

        if (activeSave != null) {
            try (Connection connection = DriverManager.getConnection(Database.getURL(), Database.getUsername(), Database.getPassword())) {
                try (Statement statement = connection.createStatement()) {
                    String query = "SELECT name FROM accounts WHERE id = " + activeSave;
                    ResultSet resultSet = statement.executeQuery(query);
                    if (resultSet.next()) {
                        name = resultSet.getString("name");
                    }
                }
            } catch (SQLException e) {
            }
        }

        return name;
    }
    
    //method to get the balance of the active save
    public static int readBalance() {
        int balance = 0;
        Integer activeSave = Database.getActiveSave();

        if (activeSave != null) {
            try (Connection connection = DriverManager.getConnection(Database.getURL(), Database.getUsername(), Database.getPassword())) {
                try (Statement statement = connection.createStatement()) {
                    String query = "SELECT balance FROM accounts WHERE id = " + activeSave;
                    ResultSet resultSet = statement.executeQuery(query);
                    if (resultSet.next()) {
                        balance = resultSet.getInt("balance");
                    }
                }
            } catch (SQLException e) {
            }
        }

        if (balance == 0) {
            balance = 100;
            System.out.println("Balance was 0, 100 points given");
        }

        return balance;
    }

    //method to read the amount of points won of the active save
    public static int readPointsWon() {
        int winHistory = 0;
        Integer activeSave = Database.getActiveSave();

        if (activeSave != null) {
            try (Connection connection = DriverManager.getConnection(Database.getURL(), Database.getUsername(), Database.getPassword())) {
                try (Statement statement = connection.createStatement()) {
                    String query = "SELECT pointsWon FROM accounts WHERE id = " + activeSave;
                    ResultSet resultSet = statement.executeQuery(query);
                    if (resultSet.next()) {
                        winHistory = resultSet.getInt("pointsWon");
                    }
                }
            } catch (SQLException e) {
            }
        }

        return winHistory;
    }

    // method to get the points lost of active save
    public static int readPointsLost() {
        int lossHistory = 0;
        Integer activeSave = Database.getActiveSave();

        if (activeSave != null) {
            try (Connection connection = DriverManager.getConnection(Database.getURL(), Database.getUsername(), Database.getPassword())) {
                try (Statement statement = connection.createStatement()) {
                    String query = "SELECT pointsLost FROM accounts WHERE id = " + activeSave;
                    ResultSet resultSet = statement.executeQuery(query);
                    if (resultSet.next()) {
                        lossHistory = resultSet.getInt("pointsLost");
                    }
                }
            } catch (SQLException e) {
            }
        }

        return lossHistory;
    }
    
    // method to read the amount of games played of active save
    public static int readGamesPlayed() {
        int gamesPlayed = 0;
        Integer activeSave = Database.getActiveSave();

        if (activeSave != null) {
            try (Connection connection = DriverManager.getConnection(Database.getURL(), Database.getUsername(), Database.getPassword())) {
                try (Statement statement = connection.createStatement()) {
                    String query = "SELECT gamesPlayed FROM accounts WHERE id = " + activeSave;
                    ResultSet resultSet = statement.executeQuery(query);
                    if (resultSet.next()) {
                        gamesPlayed = resultSet.getInt("gamesPlayed");
                    }
                }
            } catch (SQLException e) {
            }
        }
        return gamesPlayed;
    }
}
