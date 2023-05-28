
import java.awt.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CasinoMainGUITest {

    private CasinoMainGUI casinoMainGUI;

    public CasinoMainGUITest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        casinoMainGUI = new CasinoMainGUI();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class CasinoMainGUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CasinoMainGUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
