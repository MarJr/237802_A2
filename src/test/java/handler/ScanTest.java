/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handler;

import java.util.LinkedList;
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
public class ScanTest {

    public ScanTest() {
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
     * Test of getFileContent method, of class Scan.
     */
    @Test
    public void testGetFileContent() {
        System.out.println("getFileContent");
        String[] arrayListFile = new String[0];
        String pathFolder = "";
        Scan instance = new Scan();
        String[][] expResult = new String[0][0];
        String[][] result = instance.getFileContent(arrayListFile, pathFolder);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of readFileContent method, of class Scan.
     */
    @Test
    public void testReadFileContent() {
        System.out.println("readFileContent");
        String fileName = "";
        String pathFolder = "";
        int fileNumber = 0;
        Scan instance = new Scan();
        instance.listFileContent = new LinkedList<>();
        instance.readFileContent(fileName, pathFolder, fileNumber);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNumberOfFiles method, of class Scan.
     */
    @Test
    public void testGetNumberOfFiles() {
        System.out.println("getNumberOfFiles");
        Scan instance = new Scan();
        instance.fileContent = new String[0][0];
        int expResult = 0;
        int result = instance.getNumberOfFiles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
