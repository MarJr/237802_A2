/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mar Jr
 */
public class TotalDataTest {
    
    public TotalDataTest() {
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
     * Test of sortToProperPresentation method, of class TotalData.
     */
    @Test
    public void testSortToProperPresentation() {
        System.out.println("sortToProperPresentation");
        TotalData instance = null;
        instance.sortToProperPresentation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalLOC method, of class TotalData.
     */
    @Test
    public void testGetTotalLOC() {
        System.out.println("getTotalLOC");
        TotalData instance = null;
        int[][] expResult = null;
        int[][] result = instance.getTotalLOC();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSumOfKeywords method, of class TotalData.
     */
    @Test
    public void testGetSumOfKeywords() {
        System.out.println("getSumOfKeywords");
        TotalData instance = null;
        int[][] expResult = null;
        int[][] result = instance.getSumOfKeywords();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSumOfEachMatrics method, of class TotalData.
     */
    @Test
    public void testGetSumOfEachMatrics() {
        System.out.println("getSumOfEachMatrics");
        TotalData instance = null;
        int[] expResult = null;
        int[] result = instance.getSumOfEachMatrics();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDistMatrics method, of class TotalData.
     */
    @Test
    public void testGetDistMatrics() {
        System.out.println("getDistMatrics");
        TotalData instance = null;
        String[] expResult = null;
        String[] result = instance.getDistMatrics();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
