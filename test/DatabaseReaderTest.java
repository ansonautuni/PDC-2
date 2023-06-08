
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.*;

public class DatabaseReaderTest {

    private static final String URL = "jdbc:derby:mydatabase;create=true";
    private static final String USERNAME = "anson";
    private static final String PASSWORD = "anson";

    private Connection connection;
    private Statement statement;

    public DatabaseReaderTest() {
    }

    @BeforeClass
    public static void setUp() throws SQLException {
        // Create the database and table for testing
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            try (Statement statement = connection.createStatement()) {
                statement.execute("CREATE TABLE accounts ("
                        + "id INT PRIMARY KEY, "
                        + "name VARCHAR(100), "
                        + "balance INT, "
                        + "pointsWon INT, "
                        + "pointsLost INT, "
                        + "gamesPlayed INT"
                        + ")");
                statement.execute("INSERT INTO accounts VALUES (1, 'TestUser', 100, 50, 20, 10)");
            }
        }
    }

    @AfterClass
    public static void tearDown() throws SQLException {
        // Drop the table and close the database connection
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            try (Statement statement = connection.createStatement()) {
                statement.execute("DROP TABLE accounts");
            }
        }
    }

    @Test
    public void testReadBalance() {
        int balance = DatabaseReader.readBalance();
        assertNotNull(balance);
        assertTrue(balance >= 0);
    }

    @Test
    public void testReadPointsWon() {
        int pointsWon = DatabaseReader.readPointsWon();
        assertNotNull(pointsWon);
        assertTrue(pointsWon >= 0);
    }

    @Test
    public void testReadPointsLost() {
        int pointsLost = DatabaseReader.readPointsLost();
        assertNotNull(pointsLost);
        assertTrue(pointsLost >= 0);
    }

    @Test
    public void testReadGamesPlayed() {
        int gamesPlayed = DatabaseReader.readGamesPlayed();
        assertNotNull(gamesPlayed);
        assertTrue(gamesPlayed >= 0);
    }
}
