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
public class slotsCalculationsTest {
    
    public slotsCalculationsTest() {
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
     * Test of fillArray method, of class slotsCalculations.
     */
    @Test
    public void testFillArray() {
        System.out.println("fillArray");
        int[] rolls = null;
        int rollMax = 0;
        slotsCalculations instance = new slotsCalculations();
        instance.fillArray(rolls, rollMax);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printArray method, of class slotsCalculations.
     */
    @Test
    public void testPrintArray() {
        System.out.println("printArray");
        int[] rolls = null;
        slotsCalculations instance = new slotsCalculations();
        String expResult = "";
        String result = instance.printArray(rolls);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countOccurrences method, of class slotsCalculations.
     */
    @Test
    public void testCountOccurrences() {
        System.out.println("countOccurrences");
        int[] arr = null;
        int matching = 0;
        slotsCalculations instance = new slotsCalculations();
        int expResult = 0;
        int result = instance.countOccurrences(arr, matching);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeToFile method, of class slotsCalculations.
     */
    @Test
    public void testWriteToFile() {
        System.out.println("writeToFile");
        String filepath = "";
        int balance = 0;
        int winHistory = 0;
        int lossLifetime = 0;
        int gamesPlayed = 0;
        slotsCalculations.writeToFile(filepath, balance, winHistory, lossLifetime, gamesPlayed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
