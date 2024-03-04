package com.zipcodewilmington.scientific_calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import com.zipcodewilmington.scientificcalculator.Trig;

@DisplayName("Testing Trig.cosine()")
public class TestCosine {
    @Test
    public void testCosinePi() {
        double input = Math.PI;
        double expected = -1;
        double actual = Trig.cosine(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testCosineNaN() {
        double input = Double.NaN;
        double expected = Double.NaN;
        double actual = Trig.cosine(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testCosineInfinity() {
        double input = Double.POSITIVE_INFINITY;
        double expected = Double.NaN;
        double actual = Trig.cosine(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testCosineZero() {
        double input = 0;
        double expected = 1;
        double actual = Trig.cosine(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testCosineNegativeInfinity() {
        double input = Double.NEGATIVE_INFINITY;
        double expected = Double.NaN;
        double actual = Trig.cosine(input);
        assertEquals(expected, actual, 0);
    }
}
