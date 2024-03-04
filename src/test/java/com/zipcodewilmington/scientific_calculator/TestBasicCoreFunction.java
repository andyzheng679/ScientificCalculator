package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.ScientificCalculator;
import org.junit.Assert;
import org.junit.Test;

//test
public class TestBasicCoreFunction{
    @Test
    public void given10andNegative5_whenAddition_then15(){
        // Given
        var startDisplay = 10;
        var userInput = 5;
        // Expected
        var expected = 15;
        // When
        var calc = new ScientificCalculator(startDisplay);
        calc.addition(userInput);
        var actual = calc.getDisplayValue();
        //Assert
        Assert.assertEquals(expected, actual, .0002);
    }

    @Test
    public void given10andNegative5_whenAddition_then5(){
        // Given
        var startDisplay = 10;
        var userInput = -5;
        // Expected
        var expected = 5;
        // When
        var calc = new ScientificCalculator(startDisplay);
        calc.addition(userInput);
        var actual = calc.getDisplayValue();
        //Assert
        Assert.assertEquals(expected, actual, .0002);
    }

    @Test
    public void given10and5_whenSubtraction_then5(){
        // Given
        var startDisplay = 10;
        var userInput = 5;
        // Expected
        var expected = 5;
        // When
        var calc = new ScientificCalculator(startDisplay);
        calc.subtraction(userInput);
        var actual = calc.getDisplayValue();
        //Assert
        Assert.assertEquals(expected, actual, .0002);
    }

    @Test
    public void given10and15_whenSubtraction_thenNegative5(){
        // Given
        var startDisplay = 10;
        var userInput = 15;
        // Expected
        var expected = -5;
        // When
        var calc = new ScientificCalculator(startDisplay);
        calc.subtraction(userInput);
        var actual = calc.getDisplayValue();
        //Assert
        Assert.assertEquals(expected, actual, .0002);
    }

    @Test
    public void given1and8_whenMultiplication_then8(){
        // Given
        var startDisplay = 1;
        var userInput = 8;
        // Expected
        var expected = 8;
        // When
        var calc = new ScientificCalculator(startDisplay);
        calc.multiplication(userInput);
        var actual = calc.getDisplayValue();
        //Assert
        Assert.assertEquals(expected, actual, .0002);
    }

    @Test
    public void given0and8_whenMultiplication_then0(){
        // Given
        var startDisplay = 0;
        var userInput = 8;
        // Expected
        var expected = 0;
        // When
        var calc = new ScientificCalculator(startDisplay);
        calc.multiplication(userInput);
        var actual = calc.getDisplayValue();
        //Assert
        Assert.assertEquals(expected, actual, .0002);
    }

    @Test
    public void given2and4_whenMultiplication_then8(){
        // Given
        var startDisplay = 2;
        var userInput = 4;
        // Expected
        var expected = 8;
        // When
        var calc = new ScientificCalculator(startDisplay);
        calc.multiplication(userInput);
        var actual = calc.getDisplayValue();
        //Assert
        Assert.assertEquals(expected, actual, .0002);
    }

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

    @Test
    public void given10and0_whenDivision_thenError(){
        //TODO: Consider also testing for error message
        // Given
        var startDisplay = 10;
        var userInput = 0;
        // Expected
        var expected = 0;
        // When
        var calc = new ScientificCalculator(startDisplay);
        calc.division(userInput);
        var actual = calc.getDisplayValue();
        //Assert
        Assert.assertEquals(expected, actual, .0002);
    }

    @Test
    public void given2_whenSquared_then4(){
        // Given
        var startDisplay = 2;
        // Expected
        var expected = 4;
        // When
        var calc = new ScientificCalculator(startDisplay);
        calc.squared();
        var actual = calc.getDisplayValue();
        //Assert
        Assert.assertEquals(expected, actual, .0002);
    }

    @Test
    public void givenNegative2_whenSquared_then4(){
        // Given
        var startDisplay = -2;
        // Expected
        var expected = 4;
        // When
        var calc = new ScientificCalculator(startDisplay);
        calc.squared();
        var actual = calc.getDisplayValue();
        //Assert
        Assert.assertEquals(expected, actual, .0002);
    }

    @Test
    public void given4_whenSqrt_then2(){
        // Given
        var startDisplay = 4;
        // Expected
        var expected = 2;
        // When
        var calc = new ScientificCalculator(startDisplay);
        calc.sqrt();
        var actual = calc.getDisplayValue();
        //Assert
        Assert.assertEquals(expected, actual, .0002);
    }

    @Test
    public void given3_whenSqrt_then1point7320508(){
        // Given
        var startDisplay = 3;
        // Expected
        var expected = 1.7320508;
        // When
        var calc = new ScientificCalculator(startDisplay);
        calc.sqrt();
        var actual = calc.getDisplayValue();
        //Assert
        Assert.assertEquals(expected, actual, .0002);
    }

    @Test
    public void given2and3_whenExponentiation_then8(){
        // Given
        var startDisplay = 2;
        var userInput = 3;
        // Expected
        var expected = 8;
        // When
        var calc = new ScientificCalculator(startDisplay);
        calc.exponentiation(userInput);
        var actual = calc.getDisplayValue();
        //Assert
        Assert.assertEquals(expected, actual, .0002);
    }

    @Test
    public void givenNegative2and3_whenExponentiation_then8(){
        // Given
        var startDisplay = -2;
        var userInput = 3;
        // Expected
        var expected = -8;
        // When
        var calc = new ScientificCalculator(startDisplay);
        calc.exponentiation(userInput);
        var actual = calc.getDisplayValue();
        //Assert
        Assert.assertEquals(expected, actual, .0002);
    }

    @Test
    public void given10_whenInverse_thenPoint1(){
        // Given
        var startDisplay = 10;
        // Expected
        var expected = 0.1;
        // When
        var calc = new ScientificCalculator(startDisplay);
        calc.inverse();
        var actual = calc.getDisplayValue();
        //Assert
        Assert.assertEquals(expected, actual, .0002);
    }

    @Test
    public void givenPoint1_whenInverse_then10(){
        // Given
        var startDisplay = 0.1;
        // Expected
        var expected = 10;
        // When
        var calc = new ScientificCalculator(startDisplay);
        calc.inverse();
        var actual = calc.getDisplayValue();
        //Assert
        Assert.assertEquals(expected, actual, .0002);
    }

    @Test
    public void given5_whenInvertSign_thenNegative5(){
        // Given
        var startDisplay = 5;
        // Expected
        var expected = -5;
        // When
        var calc = new ScientificCalculator(startDisplay);
        calc.invertSign();
        var actual = calc.getDisplayValue();
        //Assert
        Assert.assertEquals(expected, actual, .0002);
    }

    @Test
    public void givenNegative5_whenInvertSign_then5(){
        // Given
        var startDisplay = -5;
        // Expected
        var expected = 5;
        // When
        var calc = new ScientificCalculator(startDisplay);
        calc.invertSign();
        var actual = calc.getDisplayValue();
        //Assert
        Assert.assertEquals(expected, actual, .0002);
    }
}

