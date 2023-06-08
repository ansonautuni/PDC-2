
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseWriterTest {

    private static final String URL = "jdbc:derby:mydatabase;create=true";
    private static final String USERNAME = "anson";
    private static final String PASSWORD = "anson";
    private static final int ACTIVE_SAVE = 999;

    public DatabaseWriterTest() {
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

    @Before
    public void resetStats() {
        // Reset the stats before each test
        DatabaseWriter.resetStats(ACTIVE_SAVE);
    }

    /**
     * Test of updateBalance method, of class DatabaseWriter.
     */

    @Test
    public void testResetStats() {
        int newBalance = 200;
        int newPointsWon = 100;
        int newPointsLost = 30;
        DatabaseWriter.updateBalance(ACTIVE_SAVE, newBalance);
        DatabaseWriter.updatePointsWon(ACTIVE_SAVE, newPointsWon);
        DatabaseWriter.updatePointsLost(ACTIVE_SAVE, newPointsLost);
        DatabaseWriter.increaseGamesPlayed(ACTIVE_SAVE);
        DatabaseWriter.resetStats(ACTIVE_SAVE);
        int updatedBalance = DatabaseReader.readBalance();
        int updatedPointsWon = DatabaseReader.readPointsWon();
        int updatedPointsLost = DatabaseReader.readPointsLost();
        int updatedGamesPlayed = DatabaseReader.readGamesPlayed();
        assertEquals(100, updatedBalance);
        assertEquals(0, updatedPointsWon);
        assertEquals(0, updatedPointsLost);
        assertEquals(0, updatedGamesPlayed);
    }
}
