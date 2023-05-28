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
public class savefileEditorTest {
    
    public savefileEditorTest() {
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
     * Test of readBalance method, of class savefileEditor.
     */
    @Test
    public void testReadBalance() throws Exception {
        System.out.println("readBalance");
        String filepath = "";
        int expResult = 0;
        int result = savefileEditor.readBalance(filepath);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printBalance method, of class savefileEditor.
     */
    @Test
    public void testPrintBalance() throws Exception {
        System.out.println("printBalance");
        String filepath = "";
        savefileEditor.printBalance(filepath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readWinHistory method, of class savefileEditor.
     */
    @Test
    public void testReadWinHistory() throws Exception {
        System.out.println("readWinHistory");
        String filepath = "";
        int expResult = 0;
        int result = savefileEditor.readWinHistory(filepath);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printWinHistory method, of class savefileEditor.
     */
    @Test
    public void testPrintWinHistory() throws Exception {
        System.out.println("printWinHistory");
        String filepath = "";
        savefileEditor.printWinHistory(filepath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readLossHistory method, of class savefileEditor.
     */
    @Test
    public void testReadLossHistory() throws Exception {
        System.out.println("readLossHistory");
        String filepath = "";
        int expResult = 0;
        int result = savefileEditor.readLossHistory(filepath);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printLossHistory method, of class savefileEditor.
     */
    @Test
    public void testPrintLossHistory() throws Exception {
        System.out.println("printLossHistory");
        String filepath = "";
        savefileEditor.printLossHistory(filepath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readGamesPlayed method, of class savefileEditor.
     */
    @Test
    public void testReadGamesPlayed() throws Exception {
        System.out.println("readGamesPlayed");
        String filepath = "";
        int expResult = 0;
        int result = savefileEditor.readGamesPlayed(filepath);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printGamesPlayed method, of class savefileEditor.
     */
    @Test
    public void testPrintGamesPlayed() throws Exception {
        System.out.println("printGamesPlayed");
        String filepath = "";
        savefileEditor.printGamesPlayed(filepath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetStats method, of class savefileEditor.
     */
    @Test
    public void testResetStats() throws Exception {
        System.out.println("resetStats");
        String filepath = "";
        savefileEditor.resetStats(filepath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
