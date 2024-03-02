package com.zipcodewilmington.scientific_calculator;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({TestCommonLog.class, TestNaturalLog.class, TestInverseCommonLog.class})
public class TestLogarithmSuite {

}
