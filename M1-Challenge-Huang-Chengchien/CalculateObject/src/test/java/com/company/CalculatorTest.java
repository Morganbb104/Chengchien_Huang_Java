package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void shouldAddTwoPositiveIntegers() {
        int expectedOutput = 3;
        int actualOutput = calculator.add(1, 2);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldAddTwoNegativeIntegers() {
        int expectedOutput = -20;
        int actualOutput = calculator.add(-19, -1);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void shouldDivideTwoNegativeDouble() {
        double expectedOutput = 0.625;
        double actualOutput = calculator.divide(5.00,8.00);
//        double actualOutput = calculator.divide( y);
        assertEquals(expectedOutput, actualOutput,0.005);
    }

}
//package com.company;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//
//class CalculatorTest {
//
//    @Before
//    public void setup(){
//        calculator = new Calculator();
//    }
//
//    @Test
//    public void shouldAddTwoPositiveIntergers(){
//     Calculator calculator = new Calculator();
//        int expectedOutput = 3;
//        int actualOutput = calculator.add(1,2);
//        assertEquals(expectedOutput, actualOutput);
//    }
//
//    @Test
//    public void shouldAddTwoPositiveIntergers(){
//        Calculator calculator = new Calculator();
//        int expectedOutput = -20;
//        int actualOutput = calculator.add(1,2);
//        assertEquals(expectedOutput, actualOutput);
//    }
//
//}