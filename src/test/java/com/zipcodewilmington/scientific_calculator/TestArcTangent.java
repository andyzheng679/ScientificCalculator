package com.zipcodewilmington.scientific_calculator;

import static org.junit.jupiter.api.Assertions.*;
import static com.zipcodewilmington.scientificcalculator.Trig.arcTangent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Testing Trig.arcTangent()")
public class TestArcTangent {
    @Test
    public void testArcTangentZero() {
        double input = 0;
        double expected = 0;
        double actual = arcTangent(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testArcTangentInf() {
        double input = Double.POSITIVE_INFINITY;
        double expected = Math.PI / 2;
        double actual = arcTangent(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testArcTangentNegInf() {
        double input = Double.NEGATIVE_INFINITY;
        double expected = -Math.PI / 2;
        double actual = arcTangent(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testArcTangentNaN() {
        double input = Double.NaN;
        double expected = Double.NaN;
        double actual = arcTangent(input);
        assertEquals(expected, actual, 0);
    }
}
