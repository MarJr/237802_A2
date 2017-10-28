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
public class GenerateTest {

    public GenerateTest() {
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
     * Test of setHeader method, of class Generate.
     */
    @Test
    public void testSetHeader() {
        System.out.println("setHeader");
        String semester = "";
        String course = "";
        String group = "";
        String task = "";
        Generate instance = new Generate("a");
        Generate expResult = instance;
        Generate result = instance.setHeader(semester, course, group, task);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setKeyword method, of class Generate.
     */
    @Test
    public void testSetKeyword() {
        System.out.println("setKeyword");
        String[] javaKeywords = new String[0];
        Generate instance = new Generate("a");
        Generate expResult = instance;
        Generate result = instance.setKeyword(javaKeywords);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setData method, of class Generate.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        int[][] totalKeywords = new int[0][0];
        String[] javaKeywords = new String[0];
        String[] distinctMatrik = new String[0];
        int[][] totalLOC = new int[0][0];
        int[] totalMatrik = new int[0];
        Generate instance = new Generate("a");
        Generate expResult = instance;
        Generate result = instance.setData(totalKeywords, javaKeywords, distinctMatrik, totalLOC, totalMatrik);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of processDataObject method, of class Generate.
     */
    @Test
    public void testProcessDataObject() {
        System.out.println("processDataObject");
        Generate instance = new Generate("a");
        instance.header = new String[0][0];
        instance.keyword = new String[0][0];
        instance.data = new String[0][0];
        Generate expResult = instance;
        Generate result = instance.processDataObject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of write method, of class Generate.
     */
    @Test
    public void testWrite() {
        System.out.println("write");
        Generate instance = new Generate("a");
        Generate expResult = instance;
        Generate result = instance.write();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
