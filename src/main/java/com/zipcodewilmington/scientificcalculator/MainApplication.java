package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
import java.awt.*;
import java.lang.management.MemoryManagerMXBean;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
       // GetNumber();
        //SwitchD

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
    //public class Display(){
    public void SwitchDisplayMode() {
        switch () {
            case "Binary":
                equals("Binary");
                break;
            case "Octal":
                equals("Octal");
                break;
            case "Decimal":
                equals("Decimal");
                break;
            case "Hexadecimal":
                equals("Hexadecimal");
                break;
            default:
                equals("ERROR");
                break;
        }
    //}
  }
    public void SwitchDisplayMode(String mode){
        switch(mode) {
            case "Binary":
                mode.equals("Binary");
                break;
            case "Octal":
                mode.equals("Octal");
                break;
            case "Decimal":
                mode.equals("Decimal");
                break;
            case "Hexadecimal":
                mode.equals("Hexadecimal");
                break;
            default:
                mode.equals("ERROR");
                break;
        }
    }
public class CalculatorMemory {
        double memory = 0;
    public double GetMemory() {
        return memory;
    }
    public void SetMemory(double memory){
        this.memory = memory;
    }
    public void ClearMemory() {
        this.memory = 0;
    }

}

public long Factorial(int n){
        long fact = 1;
        for(int i =2 ; i <= n ; i++){
            fact = fact * i;
        }
        return fact;
    }
}


