/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handler.identifyhandler;

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
public class LineCodeTest {
    
    public LineCodeTest() {
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
     * Test of findLOC method, of class LineCode.
     */
    @Test
    public void testFindLOC() {
        System.out.println("findLOC");
        String[][] fileContent = new String[0][0];
        LineCode instance = new LineCode();
        instance.findLOC(fileContent);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calculateForEmptyLine method, of class LineCode.
     */
    @Test
    public void testCalculateForEmptyLine() {
        System.out.println("calculateForEmptyLine");
        String[][] fileContent = new String[0][0];
        LineCode instance = new LineCode();
        instance.calculateForEmptyLine(fileContent);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
