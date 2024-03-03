package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.Display;
import com.zipcodewilmington.scientificcalculator.Factorial;
import com.zipcodewilmington.scientificcalculator.Memory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;


@RunWith(Enclosed.class)
public class TestMainApplication {
    @Test
    public void testDisplayMode() {
        Display theDisplay = new Display();
        Assert.assertEquals("Decimal", theDisplay.getMode());

        theDisplay.DisplayMode();
        Assert.assertEquals("Binary", theDisplay.getMode());

        theDisplay.DisplayMode();
        Assert.assertEquals("Octal", theDisplay.getMode());

        theDisplay.DisplayMode();
        Assert.assertEquals("Decimal", theDisplay.getMode());

        theDisplay.DisplayMode();
        Assert.assertEquals("Hexadecimal", theDisplay.getMode());

        theDisplay.DisplayMode();
        Assert.assertEquals("Binary", theDisplay.getMode());
    }


    public static class DisplayTest {
        @Test
        public void testDisplayMode() {
            Display theDisplay = new Display();
            String userInput = "Octal";
            String expectedMode = "Octal";
            theDisplay.displayMode(userInput);
            String actualMode = theDisplay.getMode();
            Assert.assertEquals(expectedMode, actualMode);
        }
    }

    public static class FactorialTest {
        @Test
        public void testFactorial() {
            Factorial factorialTest = new Factorial();
            Assert.assertEquals(120, factorialTest.factorial(5));
        }
    }
    public static class MemoryTest {
        @Test
        public void testingTheGetMemory() {
            Memory testGet = new Memory(5.0);
            Assert.assertEquals(5.0,testGet.getMemory(),0.002);
        }
        @Test
        public void testingTheSetMemory() {
            Memory testSet = new Memory(6.0);
            testSet.setMemory(10.0);
            Assert.assertEquals(10.0,testSet.getMemory(),0.002);
        }
        @Test
        public void testingTheClearMemory() {
            Memory testClear = new Memory(7.0);
            testClear.clearMemory();
            Assert.assertEquals(0,testClear.getMemory(),0.002);
        }
    }
}


