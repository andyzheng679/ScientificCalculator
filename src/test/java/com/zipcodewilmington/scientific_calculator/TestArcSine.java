package com.zipcodewilmington.scientific_calculator;

import static org.junit.jupiter.api.Assertions.*;
import static com.zipcodewilmington.scientificcalculator.Trig.arcSine;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Testing Trig.arcSine()")
public class TestArcSine {
    @Test
    public void testArcSineZero() {
        double input = 0;
        double expected = 0;
        double actual = arcSine(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testArcSineOne() {
        double input = 1;
        double expected = Math.PI / 2;
        double actual = arcSine(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testArcSineNegOne() {
        double input = -1;
        double expected = -Math.PI / 2;
        double actual = arcSine(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testArcSineMoreThanOne() {
        double input = 2;
        double expected = Double.NaN;
        double actual = arcSine(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testArcSineNaN() {
        double input = Double.NaN;
        double expected = Double.NaN;
        double actual = arcSine(input);
        assertEquals(expected, actual, 0);
    }
}
