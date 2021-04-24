package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }
    @Test
    public void testPow() {
        Calculator calculator = new Calculator();
        double c = 3;
        double d = 2;
        double powResult = calculator.pow(c, d);
        assertEquals(9, powResult);
    }
    @Test
    public void testPow1() {
        Calculator calculator = new Calculator();
        double c = 0;
        double d = 2;
        double powResult = calculator.pow(c, d);
        assertEquals(0, powResult);
    }
    @Test
    public void testPow2() {
        Calculator calculator = new Calculator();
        double c = -6;
        double d = 2;
        double powResult = calculator.pow(c, d);
        assertEquals(36, powResult);
    }
}
