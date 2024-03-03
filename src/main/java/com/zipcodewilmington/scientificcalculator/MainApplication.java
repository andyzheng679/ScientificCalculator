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
        Console.println("The user input %s as a d", d);
    }

    public static double GetNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter input");
        double num = scan.nextDouble();
        scan.close();
        return num;
    }
}


