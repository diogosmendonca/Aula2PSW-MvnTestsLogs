/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.spw.hellomaven1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diogo
 */
public class HelloMavenTest {
    
    public HelloMavenTest() {
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
     * Teste do método hello maven com parâmetro igual a false.
     */
    @Test
    public void testHelloMaven() {
        System.out.println("helloMavenMsg");
        HelloMaven instance = new HelloMaven();
        String expResult = "Hello !!!";
        String result = instance.helloMavenMsg("false");
        assertEquals(expResult, result);
    }
    
    /**
     * Teste do método hello maven com parâmetro igual a true.
     */
    @Test
    public void testHello() {
        System.out.println("helloMavenMsg");
        HelloMaven instance = new HelloMaven();
        String expResult = "Hello Maven!!!";
        String result = instance.helloMavenMsg("true");
        assertEquals(expResult, result);
    }
    
    /**
     * Teste do método hello maven com parâmetro igual a true.
     */
    @Test
    public void testHelloParametroInvalido() {
        System.out.println("helloMavenMsg");
        HelloMaven instance = new HelloMaven();
        String expResult = "Erro";
        String result = instance.helloMavenMsg("invalido");
        assertEquals(expResult, result);
    }
    
}
