package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Logarithm;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@Suite
//@SelectClasses({TestCommonLog.class, TestNaturalLog.class, TestInverseCommonLog.class, TestInverseNaturalLog.class})
public class TestLogarithmSuite {
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
