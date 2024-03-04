package com.zipcodewilmington.scientificcalculator;

public class Trig {
    private static String mode = "Radians";

    /**
     * Calculates the sine of an input angle
     * @param input the angle
     * @return the sine of the angle
     */
    public static double sine(double input) {
        if (mode.equals("Radians")) {
            return Math.sin(input);
        } else {
            return Math.sin(Math.toRadians(input));
        }
    }

    /**
     * Calculates the cosine of an input angle
     * @param input the angle
     * @return the cosine of the angle
     */
    public static double cosine(double input) {
        if (mode.equals("Radians")) {
            return Math.cos(input);
        } else {
            return Math.cos(Math.toRadians(input));
        }
    }

    /**
     * Calculates the tangent of an input angle
     * @param input the angle
     * @return the tangent of the angle
     */
    public static double tangent(double input) {
        if (mode.equals("Radians")) {
            return Math.tan(input);
        } else {
            return Math.tan(Math.toRadians(input));
        }
    }

    /**
     * Calculates the inverse sine of a number
     * @param input the number to calculate with
     * @return the angle whose sine is the input
     */
    public static double arcSine(double input) {
        if (mode.equals("Radians")) {
            return Math.asin(input);
        } else {
            return Math.toDegrees(Math.asin(input));
        }
    }

    /**
     * Calculates the inverse cosine of a number
     * @param input the number to calculate with
     * @return the angle whose cosine is the input
     */
    public static double arcCosine(double input) {
        if (mode.equals("Radians")) {
            return Math.acos(input);
        } else {
            return Math.toDegrees(Math.acos(input));
        }
    }

    /**
     * Calculates the inverse tangent of a number
     * @param input the number to calculate with
     * @return the angle whose tangent is the input
     */
    public static double arcTangent(double input) {
        if (mode.equals("Radians")) {
            return Math.atan(input);
        } else {
            return Math.toDegrees(Math.atan(input));
        }
    }

    /**
     * Switches the angle mode for Trig trigonometric functions
     */
    public static void switchMode() {
        if (mode.equals("Radians")) {
            mode = "Degrees";
        } else {
            mode = "Radians";
        }
    }

    /**
     * Switches the angle mode for Trig trigonometric functions
     * @param inMode the mode to switch to
     */
    public static void switchMode(String inMode) {
        if (!(inMode.equalsIgnoreCase("Radians") || inMode.equalsIgnoreCase("Degrees"))) {
            Console.println("Invalid trigonometry mode!");
            return;
        }
        mode = inMode;
    }
}
