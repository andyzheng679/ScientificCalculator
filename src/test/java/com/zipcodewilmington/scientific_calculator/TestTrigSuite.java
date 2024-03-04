package com.zipcodewilmington.scientific_calculator;

import org.junit.experimental.runners.Enclosed;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.*;

import static com.zipcodewilmington.scientificcalculator.Trig.*;
import static org.junit.Assert.assertEquals;
//@SuiteClasses({TestSine.class, TestCosine.class, TestTangent.class, TestArcSine.class, TestArcCosine.class, TestArcTangent.class})
public class TestTrigSuite {
    @org.junit.jupiter.api.Test
    public void testTangentZero() {
        double input = 0;
        double expected = 0;
        double actual = tangent(input);
        assertEquals(expected, actual, 0);
    }

    @org.junit.jupiter.api.Test
    public void testTangentNaN() {
        double input = Double.NaN;
        double expected = Double.NaN;
        double actual = tangent(input);
        assertEquals(expected, actual, 0);
    }

    @org.junit.jupiter.api.Test
    public void testTangentInf() {
        double input = Double.POSITIVE_INFINITY;
        double expected = Double.NaN;
        double actual = tangent(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testTangentNegInf() {
        double input = Double.NEGATIVE_INFINITY;
        double expected = Double.NaN;
        double actual = tangent(input);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testSineHalfPi() {
        double input = Math.PI / 2.0;
        double expected = 1.0;
        double actual = sine(input);
        Assertions.assertEquals(expected, actual, 0);
    }

    @Test
    public void testSineThreeHalvesPi() {
        double input = (3 * Math.PI) / 2.0;
        double expected = -1.0;
        double actual = sine(input);
        Assertions.assertEquals(expected, actual, 0);
    }

    @Test
    public void testSineNaN() {
        double input = Double.NaN;
        double expected = Double.NaN;
        double actual = sine(input);
        Assertions.assertEquals(expected, actual, 0);
    }

    @Test
    public void testSineInfinity() {
        double input = Double.POSITIVE_INFINITY;
        double expected = Double.NaN;
        double actual = sine(input);
        Assertions.assertEquals(expected, actual, 0);
    }

    @Test
    public void testSineZero() {
        double input = 0;
        double expected = 0;
        double actual = sine(input);
        Assertions.assertEquals(expected, actual, 0);
    }

    @Test
    public void testSineNegativeInfinity() {
        double input = Double.NEGATIVE_INFINITY;
        double expected = Double.NaN;
        double actual = sine(input);
        Assertions.assertEquals(expected, actual, 0);
    }

    @Test
    public void testSineNegativeZero() {
        double input = -0;
        double expected = -0;
        double actual = sine(input);
        Assertions.assertEquals(expected, actual, 0);
    }

    @Test
    public void testCosinePi() {
        double input = Math.PI;
        double expected = -1;
        double actual = cosine(input);
        Assertions.assertEquals(expected, actual, 0);
    }

    @Test
    public void testCosineNaN() {
        double input = Double.NaN;
        double expected = Double.NaN;
        double actual = cosine(input);
        Assertions.assertEquals(expected, actual, 0);
    }

    @Test
    public void testCosineInfinity() {
        double input = Double.POSITIVE_INFINITY;
        double expected = Double.NaN;
        double actual = cosine(input);
        Assertions.assertEquals(expected, actual, 0);
    }

    @Test
    public void testCosineZero() {
        double input = 0;
        double expected = 1;
        double actual = cosine(input);
        Assertions.assertEquals(expected, actual, 0);
    }

    @Test
    public void testCosineNegativeInfinity() {
        double input = Double.NEGATIVE_INFINITY;
        double expected = Double.NaN;
        double actual = cosine(input);
        Assertions.assertEquals(expected, actual, 0);
    }

    @Test
    public void testArcCosineZero() {
        double input = 0;
        double expected = Math.PI / 2;
        double actual = arcCosine(input);
        Assertions.assertEquals(expected, actual, 0);
    }

    @Test
    public void testArcCosineNegOne() {
        double input = -1;
        double expected = Math.PI;
        double actual = arcCosine(input);
        Assertions.assertEquals(expected, actual, 0);
    }

    @Test
    public void testArcCosineOne() {
        double input = 1;
        double expected = 0;
        double actual = arcCosine(input);
        Assertions.assertEquals(expected, actual, 0);
    }

    @Test
    public void testArcCosineNaN() {
        double input = Double.NaN;
        double expected = Double.NaN;
        double actual = arcCosine(input);
        Assertions.assertEquals(expected, actual, 0);
    }

    @Test
    public void testArcCosineMoreThanOne() {
        double input = 2;
        double expected = Double.NaN;
        double actual = arcCosine(input);
        Assertions.assertEquals(expected, actual, 0);
    }

    @Test
    public void testArcSineZero() {
        double input = 0;
        double expected = 0;
        double actual = arcSine(input);
        Assertions.assertEquals(expected, actual, 0);
    }

    @Test
    public void testArcSineOne() {
        double input = 1;
        double expected = Math.PI / 2;
        double actual = arcSine(input);
        Assertions.assertEquals(expected, actual, 0);
    }

    @Test
    public void testArcSineNegOne() {
        double input = -1;
        double expected = -Math.PI / 2;
        double actual = arcSine(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testArcSineMoreThanOne() {
        double input = 2;
        double expected = Double.NaN;
        double actual = arcSine(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testArcSineNaN() {
        double input = Double.NaN;
        double expected = Double.NaN;
        double actual = arcSine(input);
        Assertions.assertEquals(expected, actual, 0);
    }

    @Test
    public void testArcTangentZero() {
        double input = 0;
        double expected = 0;
        double actual = arcTangent(input);
        Assertions.assertEquals(expected, actual, 0);
    }

    @Test
    public void testArcTangentInf() {
        double input = Double.POSITIVE_INFINITY;
        double expected = Math.PI / 2;
        double actual = arcTangent(input);
        Assertions.assertEquals(expected, actual, 0);
    }

    @Test
    public void testArcTangentNegInf() {
        double input = Double.NEGATIVE_INFINITY;
        double expected = -Math.PI / 2;
        double actual = arcTangent(input);
        Assertions.assertEquals(expected, actual, 0);
    }

    @Test
    public void testArcTangentNaN() {
        double input = Double.NaN;
        double expected = Double.NaN;
        double actual = arcTangent(input);
        Assertions.assertEquals(expected, actual, 0);
    }
}
