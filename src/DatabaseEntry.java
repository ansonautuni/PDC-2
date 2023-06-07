import java.sql.*;

public class DatabaseEntry {
    private static final String URL = "jdbc:derby:mydatabase;create=true";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    public static void addEntry(int id, String name, double balance, int pointsWon, int pointsLost, int gamesPlayed) {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            try (Statement statement = connection.createStatement()) {
                // Create table (if not already created)
                String createTableQuery = "CREATE TABLE accounts (id INT, name VARCHAR(100), balance DECIMAL(10, 2), pointsWon INT, pointsLost INT, gamesPlayed INT)";
                statement.executeUpdate(createTableQuery);
                System.out.println("Table created successfully.");

                // Insert data
                String insertDataQuery = "INSERT INTO accounts VALUES (" + id + ", '" + name + "', " + balance + ", " + pointsWon + ", " + pointsLost + ", " + gamesPlayed + ")";
                statement.executeUpdate(insertDataQuery);
                System.out.println("Data inserted successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addToDatabase(int id, String name, double balance, int pointsWon, int pointsLost, int gamesPlayed) {
        addEntry(id, name, balance, pointsWon, pointsLost, gamesPlayed);
    }
}
