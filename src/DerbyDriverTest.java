import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DerbyDriverTest {
    public static void main(String[] args) {
        try {
            // Load the Derby JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");

            // Verify if the driver is registered
            Driver driver = DriverManager.getDriver("jdbc:derby:");

            // Print the driver details
            System.out.println("Derby JDBC driver loaded successfully!");
            System.out.println("Driver: " + driver.getClass().getName());
            System.out.println("Version: " + driver.getMajorVersion() + "." + driver.getMinorVersion());
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
