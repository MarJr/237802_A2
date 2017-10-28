/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

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
public class PathTest {
    
    public PathTest() {
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
     * Test of getPath method, of class Path.
     */
    @Test
    public void testGetPath() {
        System.out.println("getPath");
        String folderName = "";
        String expResult = "C:\\Users\\Mar Jr\\Documents\\NetBeansProjects\\Asg2_RealTime\\";
        String result = Path.getPath(folderName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }   
}
