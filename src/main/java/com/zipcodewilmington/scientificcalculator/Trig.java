package com.zipcodewilmington.scientificcalculator;

import java.util.Objects;

public class Trig {
    private static String mode = "Radians";

    public static double Sine(double input) {
        if (mode.equals("Radians")) {
            return Math.sin(input);
        } else {
            return Math.sin(Math.toRadians(input));
        }
    }

    public static double Cosine(int input) {
        if (mode.equals("Radians")) {
            return Math.cos(input);
        } else {
            return Math.cos(Math.toRadians(input));
        }
    }

    public static double Tangent(double input) {
        if (mode.equals("Radians")) {
            return Math.tan(input);
        } else {
            return Math.tan(Math.toRadians(input));
        }
    }

    public static double ArcSine(double input) {
        if (mode.equals("Radians")) {
            return Math.asin(input);
        } else {
            return Math.toDegrees(Math.asin(input));
        }
    }

    public static double ArcCosine(double input) {
        if (mode.equals("Radians")) {
            return Math.acos(input);
        } else {
            return Math.toDegrees(Math.acos(input));
        }
    }

    public static double ArcTangent(double input) {
        if (mode.equals("Radians")) {
            return Math.atan(input);
        } else {
            return Math.toDegrees(Math.atan(input));
        }
    }

    public static void switchMode() {
        if (mode.equals("Radians")) {
            mode = "Degrees";
        } else {
            mode = "Radians";
        }
    }

    public static void switchMode(String inMode) {
        if (!(inMode.equalsIgnoreCase("Radians") || inMode.equalsIgnoreCase("Degrees"))) {
            Console.println("Invalid trigonometry mode!");
            return;
        }
        mode = inMode;
    }
}
