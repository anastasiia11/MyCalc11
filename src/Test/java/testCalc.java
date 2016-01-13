import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by m18 on 13.01.2016.
 */
public class testCalc {

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");
    }
    @Test
    public void testAddTwoPositiveValues() {
        // Class for testing
        Calc calc = new Calc();

        // Method to check
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
    }

    @Test
    public void testAddTwoPositiveSameValues() {
        // Class for testing
        Calc calc = new Calc();

        // Method to check
        assertEquals("5 + 5 must be 10", 10, calc.add(5, 5));
    }
    @Test
    public void testAddTwoWITHONENULLValues() {
        // Class for testing
        Calc calc = new Calc();

        // Method to check
        assertEquals("5 + 0 must be 5", 5, calc.add(5, 0));
    }
    @Test
    public void testAddTwoDIFValues() {
        // Class for testing
        Calc calc = new Calc();

        // Method to check
        assertEquals("-5 + 10 must be 5", 5, calc.add(-5, 10));
    }
    @Test
    public void testAddTwoNULLYalues() {
        // Class for testing
        Calc calc = new Calc();

        // Method to check
        assertEquals("0 + 0 must be 0", 0, calc.add(0, 0));
    }
    @Test
    public void testAddTwoPositiveBigValues() {
        // Class for testing
        Calc calc = new Calc();

        // Method to check
        assertEquals("100000 + 100000 must be 200000", 200000, calc.add(100000, 100000));
    }
    @Test
    public void testAddTwoNegativeValues() {
        // Class for testing
        Calc calc = new Calc();

        // Method to check
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));

    }
    @Test
    public void testMultiplyTwoPositiveValues() {
        // Class for testing
        Calc calc = new Calc();

        // Method to check
        assertEquals("1 * 5 must be 5", 5, calc.multiply(1, 5));
    }
    @Test
    public void testDivisionTwoPositiveValues() {
        // Class for testing
        Calc calc = new Calc();

        // Method to check
        assertEquals("6 / 2 must be 3", 3, calc.division(6, 2));
    }
    @Test
    public void testSubtractionTwoPositiveValues() {
        // Class for testing
        Calc calc = new Calc();

        // Method to check
        assertEquals("6 - 2 must be 4", 4, calc.subtraction(6, 2));
    }
    @Test
    public void testSqrt() {
        // Class for testing
        Calc calc = new Calc();

        //Method to check
        assertEquals("Math.sqrt(9) must be 3", 3.0, calc.sqrt(9));
    }
    @Test
    public void testPow() {
        // Class for testing
        Calc calc = new Calc();

        // Method to check
        assertEquals("Math.pow(3,3) must be 27", 27, calc.pow(3, 3), 0.001);
    }
    @Ignore
    public void testPow1() {
        // Class for testing
        Calc calc = new Calc();

        // Method to check
        // assertEquals("Math.pow(3,3) must be 9", 9, calc.Math.pow(3));
    }
        @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!! ");

    }
}
