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
public class StatsGUITest {
    
    public StatsGUITest() {
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
     * Test of main method, of class StatsGUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        StatsGUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBalance method, of class StatsGUI.
     */
    @Test
    public void testUpdateBalance() {
        System.out.println("updateBalance");
        int balance = 0;
        StatsGUI instance = new StatsGUI();
        instance.updateBalance(balance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePointsWon method, of class StatsGUI.
     */
    @Test
    public void testUpdatePointsWon() {
        System.out.println("updatePointsWon");
        int pointswon = 0;
        StatsGUI instance = new StatsGUI();
        instance.updatePointsWon(pointswon);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePointsLost method, of class StatsGUI.
     */
    @Test
    public void testUpdatePointsLost() {
        System.out.println("updatePointsLost");
        int pointslost = 0;
        StatsGUI instance = new StatsGUI();
        instance.updatePointsLost(pointslost);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateGamesPlayed method, of class StatsGUI.
     */
    @Test
    public void testUpdateGamesPlayed() {
        System.out.println("updateGamesPlayed");
        int gamesplayed = 0;
        StatsGUI instance = new StatsGUI();
        instance.updateGamesPlayed(gamesplayed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateNetEarnings method, of class StatsGUI.
     */
    @Test
    public void testUpdateNetEarnings() {
        System.out.println("updateNetEarnings");
        int pointswon = 0;
        int pointslost = 0;
        StatsGUI instance = new StatsGUI();
        instance.updateNetEarnings(pointswon, pointslost);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readBalance method, of class StatsGUI.
     */
    @Test
    public void testReadBalance() throws Exception {
        System.out.println("readBalance");
        String filepath = "";
        int expResult = 0;
        int result = StatsGUI.readBalance(filepath);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readWinHistory method, of class StatsGUI.
     */
    @Test
    public void testReadWinHistory() throws Exception {
        System.out.println("readWinHistory");
        String filepath = "";
        int expResult = 0;
        int result = StatsGUI.readWinHistory(filepath);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readLossHistory method, of class StatsGUI.
     */
    @Test
    public void testReadLossHistory() throws Exception {
        System.out.println("readLossHistory");
        String filepath = "";
        int expResult = 0;
        int result = StatsGUI.readLossHistory(filepath);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readGamesPlayed method, of class StatsGUI.
     */
    @Test
    public void testReadGamesPlayed() throws Exception {
        System.out.println("readGamesPlayed");
        String filepath = "";
        int expResult = 0;
        int result = StatsGUI.readGamesPlayed(filepath);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetStats method, of class StatsGUI.
     */
    @Test
    public void testResetStats() throws Exception {
        System.out.println("resetStats");
        String filepath = "";
        StatsGUI.resetStats(filepath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
