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
public class KeywordJavaTest {
    
    public KeywordJavaTest() {
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
     * Test of findKeywords method, of class KeywordJava.
     */
    @Test
    public void testFindKeywords() {
        System.out.println("findKeywords");
        String[][] fileContent = new String[0][0];
        KeywordJava instance = new KeywordJava();
        instance.findKeywords(fileContent);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of javaKeywordExists method, of class KeywordJava.
     */
    @Test
    public void testJavaKeywordExists() {
        System.out.println("javaKeywordExists");
        String sentence = "";
        String search = "";
        KeywordJava instance = new KeywordJava();
        boolean expResult = true;
        boolean result = instance.javaKeywordExists(sentence, search);
        assertEquals(expResult, result);

    }

    /**
     * Test of calculateKeyword method, of class KeywordJava.
     */
    @Test
    public void testCalculateKeyword() {
        System.out.println("calculateKeyword");
        String[][] fileContent = new String[0][0];
        KeywordJava instance = new KeywordJava();
        instance.calculateKeyword(fileContent);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
