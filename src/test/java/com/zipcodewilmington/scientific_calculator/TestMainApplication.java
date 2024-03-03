package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.ScientificCalculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    @Test
    public void given10and2_whenDivision_then5(){
        // Given
        var startDisplay = 10;
        var userInput = 2;
        // Expected
        var expected = 5;
        // When
        var calc = new ScientificCalculator(startDisplay);
        calc.division(userInput);
        var actual = calc.getDisplayValue();
        //Assert
        Assert.assertEquals(expected, actual, .0002);
    }

    @Test
    public void given10andNegative2_whenDivision_thenNegative5(){
        // Given
        var startDisplay = 10;
        var userInput = -2;
        // Expected
        var expected = -5;
        // When
        var calc = new ScientificCalculator(startDisplay);
        calc.division(userInput);
        var actual = calc.getDisplayValue();
        //Assert
        Assert.assertEquals(expected, actual, .0002);
    }
}
