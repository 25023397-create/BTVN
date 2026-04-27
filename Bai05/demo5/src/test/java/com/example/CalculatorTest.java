package com.uet.thanh;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0));
    }

    @Test
    public void testCheckNumber() {
        assertEquals("Positive", calc.checkNumber(10));
        assertEquals("Negative", calc.checkNumber(-5));
        assertEquals("Zero", calc.checkNumber(0));
    }
}