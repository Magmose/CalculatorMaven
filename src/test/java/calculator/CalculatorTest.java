package calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Magnus
 */
public class CalculatorTest {
    
    public CalculatorTest() {
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
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int n1 = 5;
        int n2 = 5;
        Calculator instance = new Calculator();
        int expResult = 10;
        int result = instance.add(n1, n2);
        assertEquals(expResult, result);
    }

    /**
     * Test of sub method, of class Calculator.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        int n1 = 5;
        int n2 = 5;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.sub(n1, n2);
        assertEquals(expResult, result);
     
    }

    /**
     * Test of mul method, of class Calculator.
     */
    @Test
    public void testMul() {
        System.out.println("mul");
        int n1 = 5;
        int n2 = 5;
        Calculator instance = new Calculator();
        int expResult = 25;
        int result = instance.mul(n1, n2);
        assertEquals(expResult, result);

    }

    /**
     * Test of div method, of class Calculator.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        int n1 = 5;
        int n2 = 5;
        Calculator instance = new Calculator();
        int expResult = 1;
        int result = instance.div(n1, n2);
        assertEquals(expResult, result);
    }
    
}
