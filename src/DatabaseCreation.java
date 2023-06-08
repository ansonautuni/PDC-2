import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseCreation {
    private static final String URL = "jdbc:derby:savefileDB;create=true";
    private static final String USERNAME = "anson";
    private static final String PASSWORD = "anson";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            try (Statement statement = connection.createStatement()) {
                // Create table
                String createTableQuery = "CREATE TABLE accounts (id INT, name VARCHAR(100), balance DECIMAL(10, 2), pointsWon INT, pointsLost INT, gamesPlayed INT)";
                statement.executeUpdate(createTableQuery);
                System.out.println("Table created successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
