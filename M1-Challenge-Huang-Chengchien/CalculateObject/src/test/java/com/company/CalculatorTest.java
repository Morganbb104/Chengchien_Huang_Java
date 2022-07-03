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
    public void shouldAddTwoDoubleNumber() {
        double expectedOutput = 20.0;
        double actualOutput = calculator.add(19.5, 0.5);
        assertEquals(expectedOutput, actualOutput, 0.001);
    }

    @Test
    public void shouldSubstractReturnInt() {
        int expectedOutput = 3;
        int actualOutput = calculator.subtract(5, 2);
        assertEquals(expectedOutput, actualOutput);
        ;
    }

    @Test
    public void shouldSubstractReturnDouble() {
        double expectedOutput = 3.0;
        double actualOutput = calculator.subtract(5.5, 2.5);
        assertEquals(expectedOutput, actualOutput, 0.001);
        ;
    }

    @Test
    public void shouldMultiplyReturnInt() {
        int expectedOutput = 10;
        int actualOutput = calculator.multiply(5, 2);
        assertEquals(expectedOutput, actualOutput);
        ;
    }

    @Test
    public void shouldMultiplyReturnDouble() {
        double expectedOutput = 1.25;
        double actualOutput = calculator.multiply(5.0, 0.25);
        assertEquals(expectedOutput, actualOutput, 0.001);
        ;
    }

    @Test
    public void shouldDivideReturnInt() {
        int expectedOutput = 5;
        int actualOutput = calculator.divide(10, 2);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldDivideReturnDouble() {
        double expectedOutput = 0.5;
        double actualOutput = calculator.divide(5.00, 10.00);
        assertEquals(expectedOutput, actualOutput, 0.005);
    }
}

