package com.zipcodewilmington.scientificcalculator;

//If "Binary" set "Octal"; If "Octal" set "Decimal"; If "Decimal" set "Hexadecimal"; If "Hexadecimal" set "Binary"

import java.sql.SQLOutput;

public class Display {
    private static String mode = "Decimal";
        public void DisplayMode() {
            switch (mode.toLowerCase()) {
                case "binary":
                    mode = "Octal";
                    break;
                case "octal":
                    mode = "Decimal";
                    break;
                case "decimal":
                    mode = "Hexadecimal";
                    break;
                case "hexadecimal":
                    mode = "Binary";
                    break;
                default:
                    Console.println("No mode selected!");
                    break;
            }
        }
        public void displayMode(String inMode) {
            switch (inMode.toLowerCase()) {
                case "binary":
                   mode = "Binary";
                    break;
                case "octal":
                    mode = "Octal";
                    break;
                case "decimal":
                    mode ="Decimal";
                    break;
                case "hexadecimal":
                    mode = "Hexadecimal";
                    break;
                default:
                    Console.println("Select a mode selected!");
                    break;
            }
        }
    public String getMode() {
        return mode;
        }
    }

