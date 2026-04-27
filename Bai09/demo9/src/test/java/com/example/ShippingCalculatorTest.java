package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShippingCalculatorTest {
     ShippingCalculator calc = new ShippingCalculator();

    @Test
    void testStandard() {
        double result = calc.calculate(5, "STANDARD");
        assertEquals(15000.0, result);
    }

    @Test
    void testExpress() {
        double result = calc.calculate(5, "EXPRESS");
        assertEquals(45000.0, result);
    }

    @Test
    void testInvalidWeight() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> calc.calculate(-1, "STANDARD"));

        assertEquals("Weight must be positive", ex.getMessage());
    }

    @Test
    void testUnknownType() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> calc.calculate(5, "FAST"));

        assertTrue(ex.getMessage().contains("Unknown type"));
    }
