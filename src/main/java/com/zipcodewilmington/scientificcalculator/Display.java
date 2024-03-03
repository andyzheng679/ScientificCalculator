package com.zipcodewilmington.scientificcalculator;

//If "Binary" set "Octal"; If "Octal" set "Decimal"; If "Decimal" set "Hexadecimal"; If "Hexadecimal" set "Binary"

import java.sql.SQLOutput;

public class Display {
    private static String mode = "Decimal";
        public void DisplayMode() {
            switch (mode) {
                case "Binary":
                    mode = "Octal";
                    break;
                case "Octal":
                    mode = "Decimal";
                    break;
                case "Decimal":
                    mode = "Hexadecimal";
                    break;
                case "Hexadecimal":
                    mode = "Binary";
                    break;
                default:
                    Console.println("No mode selected!");
                    break;
            }
        }
        public void DisplayMode(String inMode) {
            switch (inMode) {
                case "Binary":
                   mode = "Binary";
                    break;
                case "Octal":
                    mode = "Octal";
                    break;
                case "Decimal":
                    mode ="Decimal";
                    break;
                case "Hexadecimal":
                    mode = "Hexadecimal";
                    break;
                default:
                    Console.println("Select a mode selected!");
                    break;
            }
        }
    }

