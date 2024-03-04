package com.zipcodewilmington.scientific_calculator;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({TestSine.class, TestCosine.class, TestTangent.class, TestArcSine.class})
public class TestTrigSuite {
}
