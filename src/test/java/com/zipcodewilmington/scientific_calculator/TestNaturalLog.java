package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Logarithm;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing Logarithm.naturalLog()")
public class TestNaturalLog {
    @Test
    public void testNaturalLogNumber() {
        double input = Math.exp(2);
        double expected = 2;
        double actual = Logarithm.naturalLog(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testNaturalLogInf() {
        double input = Double.POSITIVE_INFINITY;
        double expected = Double.POSITIVE_INFINITY;
        double actual = Logarithm.naturalLog(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testNaturalLogNegInf() {
        double input = 0;
        double expected = Double.NEGATIVE_INFINITY;
        double actual = Logarithm.naturalLog(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testNaturalLogNaN() {
        double input = Double.NaN;
        double expected = Double.NaN;
        double actual = Logarithm.naturalLog(input);
        assertEquals(expected, actual, 0);
    }
}
