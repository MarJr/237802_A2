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
public class CommentTest {

    public CommentTest() {
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
     * Test of findComments method, of class Comment.
     */
    @Test
    public void testFindComments() {
        System.out.println("findComments");
        String[][] fileContent = new String[0][0];
        Comment instance = new Comment();
        instance.findComments(fileContent);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setFixedCommentTitle method, of class Comment.
     */
    @Test
    public void testSetFixedCommentTitle() {
        System.out.println("setFixedCommentTitle");
        String[][] fileContent = new String[0][0];
        Comment instance = new Comment();
        instance.setFixedCommentTitle(fileContent);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setVariableCommentTitle method, of class Comment.
     */
    @Test
    public void testSetVariableCommentTitle() {
        System.out.println("setVariableCommentTitle");
        String[][] fileContent = new String[0][0];
        Comment instance = new Comment();
        instance.setVariableCommentTitle(fileContent);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of checkFixedCommentKeyword method, of class Comment.
     */
    @Test
    public void testCheckFixedCommentKeyword() {
        System.out.println("checkFixedCommentKeyword");
        String sentence = "";
        String search = "";
        Comment instance = new Comment();
        boolean expResult = false;
        boolean result = instance.checkFixedCommentKeyword(sentence, search);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of grepThisWord method, of class Comment.
     */
    @Test
    public void testGrepThisWord() {
        System.out.println("grepThisWord");
        String sentence = "";
        String search = "";
        Comment instance = new Comment();
        String expResult = "";
        String result = instance.grepThisWord(sentence, search);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
