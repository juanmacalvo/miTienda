/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class ArticuloTest {
    
    public ArticuloTest() {
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
     * Test of getStock method, of class Articulo.
     */
    @Test
    public void testGetStock() {
        System.out.println("getStock");
        Articulo instance = null;
        int expResult = 0;
        int result = instance.getStock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStock method, of class Articulo.
     */
    @Test
    public void testSetStock() {
        System.out.println("setStock");
        int stock = 0;
        Articulo instance = null;
        instance.setStock(stock);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPvp method, of class Articulo.
     */
    @Test
    public void testGetPvp() {
        System.out.println("getPvp");
        Articulo instance = null;
        int expResult = 0;
        int result = instance.getPvp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Articulo.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Articulo instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPvp method, of class Articulo.
     */
    @Test
    public void testSetPvp() {
        System.out.println("setPvp");
        int pvp = 0;
        Articulo instance = null;
        instance.setPvp(pvp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Articulo.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Articulo instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
