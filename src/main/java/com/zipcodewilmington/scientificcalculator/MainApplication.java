package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
import java.awt.*;
import java.lang.management.MemoryManagerMXBean;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a double", d);

        Scanner scanner = new Scanner(System.in);
        ScientificCalculator calculator = new ScientificCalculator(0);

        while(true){
            System.out.println("Here is the current display value: " + calculator.getDisplayValue());
            System.out.println("Enter new display value: ");
            double input = scanner.nextDouble();
            calculator.changeDisplay(input);
            System.out.println("New display value: " + calculator.getDisplayValue());
            System.out.println("Pick operation: +, -, *, /, squared, sqrt, exponentiation, inverse, invertSign, clear, or exit: ");

            String operationInput = scanner.next();

            if(operationInput.equalsIgnoreCase("exit")){
                break;
            }

            switch(operationInput.toLowerCase()){
                case "+":
                    System.out.println("Enter a number to add to the display number: ");
                    calculator.addition(scanner.nextDouble());
                    //break;


            }

            //

        }




    }


}


