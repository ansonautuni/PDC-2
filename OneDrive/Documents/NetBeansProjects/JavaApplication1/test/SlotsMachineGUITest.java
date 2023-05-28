/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

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
public class SlotsMachineGUITest {
    
    public SlotsMachineGUITest() {
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
     * Test of main method, of class SlotsMachineGUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SlotsMachineGUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBalance method, of class SlotsMachineGUI.
     */
    @Test
    public void testUpdateBalance() {
        System.out.println("updateBalance");
        int balance = 0;
        SlotsMachineGUI instance = new SlotsMachineGUI();
        instance.updateBalance(balance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readBalance method, of class SlotsMachineGUI.
     */
    @Test
    public void testReadBalance() throws Exception {
        System.out.println("readBalance");
        String filepath = "";
        int expResult = 0;
        int result = SlotsMachineGUI.readBalance(filepath);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
