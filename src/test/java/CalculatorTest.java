import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import calculator.Calculator;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();    

    @Test
    public void sqrtTruePositive(){
        assertEquals("Sqrt for true positive", 10, calculator.Sqrt(100), DELTA);
        assertEquals("Sqrt for true positive", 2, calculator.Sqrt(4), DELTA);
        assertEquals("Sqrt for true positive", 4, calculator.Sqrt(16), DELTA);
    }

    @Test
    public void sqrtFalsePostitive(){
        assertNotEquals("Sqrt for false positive", 1, calculator.Sqrt(100), DELTA);
        assertNotEquals("Sqrt for false positive", 0,  calculator.Sqrt(81), DELTA);
        assertNotEquals("Sqrt for false positive", 20,  calculator.Sqrt(16), DELTA);
    }

    @Test
    public void factTruePositive(){
        assertEquals("factorial for true positive", 24, calculator.factorial(4), DELTA);
        assertEquals("factorial for true positive", 120, calculator.factorial(5), DELTA);
        assertEquals("factorial for true positive", 3628800, calculator.factorial(10), DELTA);
    }
    

    @Test
    public void factFalsePostitive(){
        assertNotEquals("factorial for false positive", 100, calculator.factorial(10), DELTA);
        assertNotEquals("factorial for false positive", 200,  calculator.factorial(4), DELTA);
        assertNotEquals("factorial for false positive", 300,  calculator.factorial(6), DELTA);
    }


    @Test
    public void logTruePositive(){
        assertEquals("natural log for true positive", 0, calculator.natLog(1), DELTA);
        assertEquals("natural log for true positive", 0, calculator.natLog(1), DELTA);
    }
    

    @Test
    public void logFalsePostitive(){
        assertNotEquals("natural log for false positive", 6, calculator.natLog(2.4), DELTA);
        assertNotEquals("natural log for false positive", 7.3,  calculator.natLog(10), DELTA);
        assertNotEquals("natural log for false positive", 7.3,  calculator.natLog(11), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("power for true positive", 16, calculator.power(2, 4), DELTA);
        assertEquals("power for true positive", 100, calculator.power(10, 2), DELTA);
        assertEquals("power for true positive", 36, calculator.power(6, 2), DELTA);
        assertEquals("power for true positive", 81, calculator.power(9, 2), DELTA);
    }
    

    @Test
    public void powerFalsePostitive(){
        assertNotEquals("power for false positive", 5, calculator.power(2, 4), DELTA);
        assertNotEquals("power for false positive", 1000,  calculator.power(10, 2), DELTA);
        assertNotEquals("power for false positive", 100,  calculator.power(9, 2), DELTA);
    }


}
