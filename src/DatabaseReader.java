import java.sql.*;

public class DatabaseReader {
    
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
                e.printStackTrace();
            }
        }
        return hasEntry;
    }
    
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
                e.printStackTrace();
            }
        }

        return name;
    }

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
                e.printStackTrace();
            }
        }

        if (balance == 0) {
            balance = 100;
            System.out.println("Balance was 0, 100 points given");
        }

        return balance;
    }

    //method to read the second line which is how many points the user has won
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
                e.printStackTrace();
            }
        }

        return winHistory;
    }

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
                e.printStackTrace();
            }
        }

        return lossHistory;
    }

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
                e.printStackTrace();
            }
        }

        return gamesPlayed;
    }
}
