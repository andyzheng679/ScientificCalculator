package com.zipcodewilmington.scientific_calculator;

import static org.junit.jupiter.api.Assertions.*;
import static com.zipcodewilmington.scientificcalculator.Trig.tangent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Testing Trig.tangent()")
public class TestTangent {
    @Test
    public void testTangentZero() {
        double input = 0;
        double expected = 0;
        double actual = tangent(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testTangentNaN() {
        double input = Double.NaN;
        double expected = Double.NaN;
        double actual = tangent(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testTangentInf() {
        double input = Double.POSITIVE_INFINITY;
        double expected = Double.NaN;
        double actual = tangent(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testTangentNegInf() {
        double input = Double.NEGATIVE_INFINITY;
        double expected = Double.NaN;
        double actual = tangent(input);
        assertEquals(expected, actual, 0);
    }
}
