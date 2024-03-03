package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Logarithm;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing Logarithm.inverseCommonLog()")
public class TestInverseCommonLog {
    @Test
    public void testInvCommonLogZero() {
        double input = 0.0;
        double expected = 1.0;
        double actual = Logarithm.inverseCommonLog(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testInvCommonLogOne() {
        double input = 1.0;
        double expected = 10.0;
        double actual = Logarithm.inverseCommonLog(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testInvCommonLogNaN() {
        double input = Double.NaN;
        double expected = Double.NaN;
        double actual = Logarithm.inverseCommonLog(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testInvCommonLogInf() {
        double input = Double.POSITIVE_INFINITY;
        double expected = Double.POSITIVE_INFINITY;
        double actual = Logarithm.inverseCommonLog(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testInvCommonLogNegInf() {
        double input = Double.NEGATIVE_INFINITY;
        double expected = 0.0;
        double actual = Logarithm.inverseCommonLog(input);
        assertEquals(expected, actual, 0);
    }
}
