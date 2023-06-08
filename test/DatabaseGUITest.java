
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;


public class DatabaseGUITest {

    private Connection connection;

    public DatabaseGUITest() {
    }

    @Before
    public void setup() throws SQLException {
        connection = DriverManager.getConnection(DatabaseGUI.URL, DatabaseGUI.USERNAME, DatabaseGUI.PASSWORD);
        createTestTable();
        insertTestData();
    }

    @After
    public void cleanup() throws SQLException {
        dropTestTable();
        if (connection != null) {
            connection.close();
        }
    }

    /**
     * Test of getActiveSave method, of class DatabaseGUI.
     */
    @Test
    public void testValuesInId1() {
        // Arrange
        DatabaseGUI databaseGUI = new DatabaseGUI();

        // Act
        String[] rowData = getRowData(databaseGUI, 1);

        // Assert
        assertEquals("Value1", rowData[0]);  // Replace "Value1" with the expected value in column 1 (assuming it's a String)
        assertEquals("Value2", rowData[1]);  // Replace "Value2" with the expected value in column 2 (assuming it's a String)
        assertEquals("Value3", rowData[2]);  // Replace "Value3" with the expected value in column 3 (assuming it's a String)
        // Add more assertions for other columns if necessary
    }

    private void createTestTable() throws SQLException {
        Statement statement = connection.createStatement();
        statement.execute("CREATE TABLE entries (id INT, col1 VARCHAR(50), col2 VARCHAR(50), col3 VARCHAR(50))");
        statement.close();
    }

    private void insertTestData() throws SQLException {
        Statement statement = connection.createStatement();
        statement.execute("INSERT INTO entries VALUES (1, 'Value1', 'Value2', 'Value3')");
        // Add more INSERT statements for additional test data if necessary
        statement.close();
    }

    private void dropTestTable() throws SQLException {
        Statement statement = connection.createStatement();
        statement.execute("DROP TABLE entries");
        statement.close();
    }

    private String[] getRowData(DatabaseGUI databaseGUI, int row) {
        String[] rowData = new String[3];
        for (int column = 0; column < 3; column++) {
            rowData[column] = (String) databaseGUI.getTable().getValueAt(row - 1, column);
        }
        return rowData;
    }
}
