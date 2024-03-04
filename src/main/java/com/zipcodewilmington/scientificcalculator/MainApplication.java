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
            Console.println("New display value: " + calculator.getDisplayValue());
            Console.println("Pick operation: +, -, *, /, !, square, sqrt, power, inverse, negate, clear,");
            Console.println("m+, mcl, mrc, sin, cos, tan, asin, acos, atan, log, ln, log-1, e^x, exit: ");

            String operationInput = scanner.next();

            if(operationInput.equalsIgnoreCase("exit")){
                break;
            }

            switch(operationInput.toLowerCase()){
                case "+":
                    Console.println("Enter a number to add: ");
                    double adder = scanner.nextDouble();
                    calculator.addition(adder);
                    break;
                case "-":
                    Console.println("Enter a number to subtract: ");
                    double difference = scanner.nextDouble();
                    calculator.subtraction(difference);
                    break;
                case "*":
                    Console.println("Enter a number to multiply by: ");
                    double multiplier = scanner.nextDouble();
                    calculator.multiplication(multiplier);
                    break;
                case "/":
                    Console.println("Enter a number to divide by: ");
                    double divisor = scanner.nextDouble();
                    calculator.division(divisor);
                    break;
                case "!":
                    long fact = Factorial.factorial((int) calculator.getDisplayValue());
                    calculator.changeDisplay((double) fact);
                    break;
                case "square":
                    calculator.squared();
                    break;
                case "sqrt":
                    calculator.sqrt();
                    break;
                case "power":
                    Console.println("Enter an exponent: ");
                    double exponent = scanner.nextDouble();
                    calculator.exponentiation(exponent);
                    break;
                case "inverse":
                    calculator.inverse();
                    break;
                case "negate":
                    calculator.invertSign();
                    break;
                case "clear":
                    calculator.clearDisplayValue();
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
                default:
                    Console.println("Not a valid operation. Try again");
                    break;
            }

            //

        }




    }


}


