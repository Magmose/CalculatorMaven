/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrationtests;

import calculator.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.HttpClient;

/**
 *
 * @author Magnus
 */
public class WebCalculatorTest {
    
    public WebCalculatorTest() {
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
     * Test of makeHttpRequest method, of class HttpClient.
     */
    @Test
    public void testMakeHttpRequest() throws Exception {
        HttpClient httpC = new HttpClient("http://localhost:7777/CalculatorMaven/calculator");
        String params = "?operation=add&n1=2&n2=3";
        HttpClient instance = httpC;
        String expResult = "Result of: 2+3= 5";
        String result = instance.makeHttpRequest(params);
        assertEquals(expResult, result);
    }


}
