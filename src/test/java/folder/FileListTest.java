/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

import static asg2.Main.PATHFOLDER;
import java.io.File;
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
public class FileListTest {

    public FileListTest() {
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
     * Test of listFilesForFolder method, of class FileList.
     */
    @Test
    public void testListFilesForFolder() {
        System.out.println("listFilesForFolder");
        File folder = new File(Path.getPath(PATHFOLDER));
        FileList instance = new FileList();
        FileList expResult = instance;
        FileList result = instance.listFilesForFolder(folder);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addToList method, of class FileList.
     */
    @Test
    public void testAddToList() {
        System.out.println("addToList");
        String fileExt = "java";
        FileList instance = new FileList();
        instance.addToList(fileExt);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getFileList method, of class FileList.
     */
    @Test
    public void testGetFileList() {
        System.out.println("getFileList");
        FileList instance = new FileList();
        String[] expResult = {};
        String[] result = instance.getFileList();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class FileList.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        FileList instance = new FileList();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of JavaExtension method, of class FileList.
     */
    @Test
    public void testJavaExtension() {
        System.out.println("JavaExtension");
        String fileExt = "java";
        FileList instance = new FileList();
        boolean expResult = true;
        boolean result = instance.JavaExtension(fileExt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
