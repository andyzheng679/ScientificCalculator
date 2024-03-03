package com.zipcodewilmington.scientific_calculator;

import static org.junit.jupiter.api.Assertions.*;
import com.zipcodewilmington.scientificcalculator.Trig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Testing Trig.sine()")
public class TestSine {
    @Test
    public void testSineHalfPi() {
        double input = Math.PI / 2.0;
        double expected = 1.0;
        double actual = Trig.sine(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testSineThreeHalvesPi() {
        double input = (3 * Math.PI) / 2.0;
        double expected = -1.0;
        double actual = Trig.sine(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testSineNaN() {
        double input = Double.NaN;
        double expected = Double.NaN;
        double actual = Trig.sine(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testSineInfinity() {
        double input = Double.POSITIVE_INFINITY;
        double expected = Double.NaN;
        double actual = Trig.sine(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testSineZero() {
        double input = 0;
        double expected = 0;
        double actual = Trig.sine(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testSineNegativeInfinity() {
        double input = Double.NEGATIVE_INFINITY;
        double expected = Double.NaN;
        double actual = Trig.sine(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testSineNegativeZero() {
        double input = -0;
        double expected = -0;
        double actual = Trig.sine(input);
        assertEquals(expected, actual, 0);
    }
}
