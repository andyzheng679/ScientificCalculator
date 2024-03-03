package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Logarithm;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing Logarithm.commonLog()")
public class TestCommonLog {
    @Test
    public void testCommonLogNumber() {
        double input = 100;
        double expected = 2;
        double actual = Logarithm.commonLog(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testCommonLogInf() {
        double input = Double.POSITIVE_INFINITY;
        double expected = Double.POSITIVE_INFINITY;
        double actual = Logarithm.commonLog(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testCommonLogNegInf() {
        double input = 0;
        double expected = Double.NEGATIVE_INFINITY;
        double actual = Logarithm.commonLog(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testCommonLogNaN() {
        double input = Double.NaN;
        double expected = Double.NaN;
        double actual = Logarithm.commonLog(input);
        assertEquals(expected, actual, 0);
    }
}
