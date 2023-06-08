/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import javax.swing.JTable;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Deadl
 */
public class DatabaseGUIMethodsTest {
    
    public DatabaseGUIMethodsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of fetchEntries method, of class DatabaseGUIMethods.
     */
    @Test
    public void testFetchEntries() {
        System.out.println("fetchEntries");
        JTable table = null;
        DatabaseGUIMethods.fetchEntries(table);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEntry method, of class DatabaseGUIMethods.
     */
    @Test
    public void testAddEntry() {
        System.out.println("addEntry");
        int nextId = 0;
        JTable table = null;
        DatabaseGUIMethods.addEntry(nextId, table);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearDatabase method, of class DatabaseGUIMethods.
     */
    @Test
    public void testClearDatabase() {
        System.out.println("clearDatabase");
        JTable table = null;
        DatabaseGUIMethods.clearDatabase(table);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnToMainMenu method, of class DatabaseGUIMethods.
     */
    @Test
    public void testReturnToMainMenu() {
        System.out.println("returnToMainMenu");
        DatabaseGUIMethods.returnToMainMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateActiveSave method, of class DatabaseGUIMethods.
     */
    @Test
    public void testUpdateActiveSave() {
        System.out.println("updateActiveSave");
        JTextField activeSaveField = null;
        DatabaseGUIMethods.updateActiveSave(activeSaveField);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
