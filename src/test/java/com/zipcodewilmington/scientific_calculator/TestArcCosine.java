package com.zipcodewilmington.scientific_calculator;

import static org.junit.jupiter.api.Assertions.*;
import static com.zipcodewilmington.scientificcalculator.Trig.arcCosine;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Testing Trig.arcCosine()")
public class TestArcCosine {
    @Test
    public void testArcCosineZero() {
        double input = 0;
        double expected = Math.PI / 2;
        double actual = arcCosine(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testArcCosineNegOne() {
        double input = -1;
        double expected = Math.PI;
        double actual = arcCosine(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testArcCosineOne() {
        double input = 1;
        double expected = 0;
        double actual = arcCosine(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testArcCosineNaN() {
        double input = Double.NaN;
        double expected = Double.NaN;
        double actual = arcCosine(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testArcCosineMoreThanOne() {
        double input = 2;
        double expected = Double.NaN;
        double actual = arcCosine(input);
        assertEquals(expected, actual, 0);
    }
}
