package com.zipcodewilmington.scientificcalculator;

public class Logarithm {
    /**
     * This function calculates the common logarithm (log_10(x)) of a number
     * @param input The number to calculate with (x)
     * @return The common logarithm of the input
     */
    public static double commonLog (double input) {
        return Math.log10(input);
    }

    /**
     * This function calculates the inverse common logarithm (10^x) of a number
     * @param input The number to calculate with (x)
     * @return The inverse common log of the input
     */
    public static double inverseCommonLog (double input) {
        return Math.pow(10, input);
    }

    /**
     * This function calculates the natural logarithm (log_e(x)) of a number
     * @param input The number to calculate with (x)
     * @return The natural logarithm of the input
     */
    public static double naturalLog (double input) {
        return Math.log(input);
    }

    /**
     * This function calculates the inverse natural logarithm (e^x) of a number
     * @param input The number to calculate with (x)
     * @return The inverse natural logarithm of the input
     */
    public static double inverseNaturalLog (double input) {
        return Math.exp(input);
    }
}
