package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
import java.awt.*;
import java.lang.management.MemoryManagerMXBean;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        /*
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a double", d);
         */

        Scanner scanner = new Scanner(System.in);
        ScientificCalculator calculator = new ScientificCalculator(0);
        System.out.println("Here is the current display value: " + calculator.getDisplayValue());
        System.out.println("Enter new display value: ");
        double input = scanner.nextDouble();
        calculator.changeDisplay(input);

        while(true){
            System.out.println("New display value: " + calculator.getDisplayValue());
            System.out.println("Pick operation: +, -, *, /, squared, sqrt, exponentiation, inverse, invertsign, clear, or exit: ");

            String operationInput = scanner.next();

            if(operationInput.equalsIgnoreCase("exit")){
                break;
            }

            switch(operationInput.toLowerCase()){
                case "+":
                    System.out.println("Enter a number to add to the display number: ");
                    calculator.addition(scanner.nextDouble());
                    break;

                case "-":
                    System.out.println("Enter a number to subtract from the display number: ");
                    calculator.subtraction(scanner.nextDouble());
                    break;

                case "*":
                    System.out.println("Enter a number to multiply to the display number: ");
                    calculator.multiplication(scanner.nextDouble());
                    break;

                case "/":
                    System.out.println("Enter a number to divide to the display number, no zero: ");
                    calculator.division(scanner.nextDouble());
                    break;

                case "squared":
                    System.out.println("It will now square the display value: ");
                    calculator.squared();
                    break;

                case "sqrt":
                    System.out.println("It will now sqrt the display value: ");
                    calculator.sqrt();
                    break;

                case "exponentiation":
                    System.out.println("Enter the exponent: ");
                    calculator.exponentiation(scanner.nextDouble());
                    break;

                case "inverse":
                    System.out.println("This will now inverse the display value: ");
                    calculator.inverse();
                    break;

                case "invertsign":
                    System.out.println("This will now inverse the sign of the display value: ");
                    calculator.invertSign();
                    break;

                case "clear":
                    System.out.println("Will now clear display value");
                    calculator.clearDisplayValue();
                    break;

                default:
                    System.out.println("NOT AN OPERATION");


            }

        }




    }


}


