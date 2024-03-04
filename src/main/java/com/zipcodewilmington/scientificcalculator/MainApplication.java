package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScientificCalculator calculator = new ScientificCalculator(0);
        Memory calcMem = new Memory(0.0);

        Console.println("Here is the current display value: " + calculator.getDisplayValue());
        Console.println("Enter new display value: ");
        double input = scanner.nextDouble();
        calculator.changeDisplay(input);

        while(true){

            System.out.println("New display value: " + calculator.getDisplayValue());
            System.out.println("Pick operation: +, -, *, /, !, squared, sqrt, exponentiation, inverse, invertsign,  clear, exit, ");
            System.out.println("m+, mcl, mrc, sin, cos, tan, asin, acos, atan, log, ln, log-1, or e^x: ")

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
                
                case "m+":
                    double addMem = calcMem.getMemory();
                    addMem += calculator.getDisplayValue();
                    calcMem.setMemory(addMem);
                    calculator.changeDisplay(addMem);
                
                case "mcl":
                    calcMem.clearMemory();
                    break;
                
                case "mrc":
                    calculator.changeDisplay(calcMem.getMemory());
                    break;
                
                case "sin":
                    calculator.changeDisplay(Trig.sine(calculator.getDisplayValue()));
                    break;
                
                case "cos":
                    calculator.changeDisplay(Trig.cosine(calculator.getDisplayValue()));
                    break;
                
                case "tan":
                    calculator.changeDisplay(Trig.tangent(calculator.getDisplayValue()));
                    break;
                
                case "asin":
                    calculator.changeDisplay(Trig.arcSine(calculator.getDisplayValue()));
                    break;
                
                case "acos":
                    calculator.changeDisplay(Trig.arcCosine(calculator.getDisplayValue()));
                    break;
                
                case "atan":
                    calculator.changeDisplay(Trig.arcTangent(calculator.getDisplayValue()));
                    break;
                
                case "log":
                    calculator.changeDisplay(Logarithm.commonLog(calculator.getDisplayValue()));
                    break;
                
                case "ln":
                    calculator.changeDisplay(Logarithm.naturalLog(calculator.getDisplayValue()));
                    break;
                
                case "log-1":
                    calculator.changeDisplay(Logarithm.inverseCommonLog(calculator.getDisplayValue()));
                    break;
                
                case "e^x":
                    calculator.changeDisplay(Logarithm.inverseNaturalLog(calculator.getDisplayValue()));
                    break;

                case "clear":
                    System.out.println("Will now clear display value");
                    calculator.clearDisplayValue();
                    break;
                
                case "!":
                    long fact = Factorial.factorial((int) calculator.getDisplayValue());
                    calculator.changeDisplay((double) fact);
                    break;

                default:
                    System.out.println("NOT AN OPERATION");
            }

        }




    }


}


