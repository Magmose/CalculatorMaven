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

    HttpClient httpC = new HttpClient("http://localhost:7777/CalculatorMaven/calculator");

    /**
     * Test of makeHttpRequest method, of class HttpClient.
     */
    @Test
    public void testAddHttpRequest() throws Exception {
        String params = "?operation=add&n1=2&n2=3";
        HttpClient instance = httpC;
        String expResult = "Result of: 2+3= 5";
        String result = instance.makeHttpRequest(params);
        assertEquals(expResult, result);
    }

    @Test
    public void testSubHttpRequest() throws Exception {
        String params = "?operation=sub&n1=8&n2=3";
        HttpClient instance = httpC;
        String expResult = "Result of: 8-3= 5";
        String result = instance.makeHttpRequest(params);
        assertEquals(expResult, result);
    }

    @Test
    public void testMulHttpRequest() throws Exception {
        String params = "?operation=mul&n1=2&n2=3";
        HttpClient instance = httpC;
        String expResult = "Result of: 2*3= 6";
        String result = instance.makeHttpRequest(params);
        assertEquals(expResult, result);
    }
    @Test
    public void testDivHttpRequest() throws Exception {
        String params = "?operation=div&n1=12&n2=2";
        HttpClient instance = httpC;
        String expResult = "Result of: 12/2= 6";
        String result = instance.makeHttpRequest(params);
        assertEquals(expResult, result);
    }
}
