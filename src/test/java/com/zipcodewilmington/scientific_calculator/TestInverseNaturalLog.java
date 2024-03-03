package com.zipcodewilmington.scientific_calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import com.zipcodewilmington.scientificcalculator.Logarithm;

@DisplayName("Testing Logarithm.inverseNaturalLog()")
public class TestInverseNaturalLog {
    @Test
    public void testInverseNaturalLogESq() {
        double input = 2.0;
        double expected = Math.exp(input);
        double actual = Logarithm.inverseNaturalLog(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testInverseNaturalLogInf() {
        double input = Double.POSITIVE_INFINITY;
        double expected = Double.POSITIVE_INFINITY;
        double actual = Logarithm.inverseNaturalLog(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testInverseNaturalLogNegInf() {
        double input = Double.NEGATIVE_INFINITY;
        double expected = 0.0;
        double actual = Logarithm.inverseNaturalLog(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testInverseNaturalLogNaN() {
        double input = Double.NaN;
        double expected = Double.NaN;
        double actual = Logarithm.inverseNaturalLog(input);
        assertEquals(expected, actual, 0);
    }
}
