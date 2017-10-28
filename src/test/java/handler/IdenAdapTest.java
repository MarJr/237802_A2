/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handler;

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
public class IdenAdapTest {

    public IdenAdapTest() {
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
     * Test of findAll method, of class IdenAdap.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        String[][] fileContent = new String[0][0];
        IdenAdap instance = new IdenAdap(new String[0][0]);
        instance.findAll(fileContent);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getSemester method, of class IdenAdap.
     */
    @Test
    public void testGetSemester() {
        System.out.println("getSemester");
        IdenAdap instance = new IdenAdap(new String[0][0]);
        String expResult = null;
        String result = instance.getSemester();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCourse method, of class IdenAdap.
     */
    @Test
    public void testGetCourse() {
        System.out.println("getCourse");
        IdenAdap instance = new IdenAdap(new String[0][0]);
        String expResult = null;
        String result = instance.getCourse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getGroup method, of class IdenAdap.
     */
    @Test
    public void testGetGroup() {
        System.out.println("getGroup");
        IdenAdap instance = new IdenAdap(new String[0][0]);
        String expResult = null;
        String result = instance.getGroup();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTask method, of class IdenAdap.
     */
    @Test
    public void testGetTask() {
        System.out.println("getTask");
        IdenAdap instance = new IdenAdap(new String[0][0]);
        String expResult = null;
        String result = instance.getTask();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getName method, of class IdenAdap.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        IdenAdap instance = new IdenAdap(new String[0][0]);
        String[] expResult = new String[0];
        String[] result = instance.getName();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getMatrics method, of class IdenAdap.
     */
    @Test
    public void testGetMatrics() {
        System.out.println("getMatrics");
        IdenAdap instance = new IdenAdap(new String[0][0]);
        String[] expResult = new String[0];
        String[] result = instance.getMatrics();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCountKeywords method, of class IdenAdap.
     */
    @Test
    public void testGetCountKeywords() {
        System.out.println("getCountKeywords");
        IdenAdap instance = new IdenAdap(new String[0][0]);
        int[][] expResult = new int[0][0];
        int[][] result = instance.getCountKeywords();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getJavaKeywords method, of class IdenAdap.
     */
    @Test
    public void testGetJavaKeywords() {
        System.out.println("getJavaKeywords");
        IdenAdap instance = new IdenAdap(new String[0][0]);
        String[] expResult = {"abstract", "assert", "boolean ",
            "break", "byte ", "case", "catch", "char ", "class", "const",
            "continue", "default", "do", "double ", "else", "extends", "false",
            "final", "finally", "float ", "for", "goto", "if", "implements",
            "import", "instanceof", "int ", "interface", "long ", "native",
            "new", "null", "package", "private", "protected", "public",
            "return", "short", "static", "strictfp", "super", "switch",
            "synchronized", "this", "throw", "throws", "transient", "true",
            "try", "void", "volatile", "while", "enum"};
        String[] result = instance.getJavaKeywords();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getLOC method, of class IdenAdap.
     */
    @Test
    public void testGetLOC() {
        System.out.println("getLOC");
        IdenAdap instance = new IdenAdap(new String[0][0]);
        int[][] expResult = new int[0][0];
        int[][] result = instance.getLOC();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
