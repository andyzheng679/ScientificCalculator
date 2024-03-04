package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class ScientificCalculator {
    private double displayValue = 0;    //default value is 0
    private boolean isError = false;   //default value is false

    public ScientificCalculator(double displayValue){   //constructor

        this.displayValue = displayValue;

    }

    public double getDisplayValue(){    //getting current display value

        return this.displayValue;
    }

    public void clearDisplayValue(){    //setting display value back to 0 and error to false "clearing it"
        this.displayValue = 0;
        this.isError = false;
    }

    public void changeDisplay(double newDisplayValue){ //setting the display to a num
        if(!this.isError){
            this.displayValue = newDisplayValue;
        }
    }

    public void errorMessage(){

        System.out.println("ERROR");
        this.displayValue = 0;
        this.isError = false;
        /*
        System.out.println("Enter new display value: ");
        double input = scanner.nextDouble();
        this.displayValue = input;
        */
    }

    public void addition(double numtoAdd){
        if(!this.isError){
            this.displayValue += numtoAdd;
        }
    }

    public void subtraction(double numtoSub){
        if(!this.isError){
            this.displayValue -= numtoSub;
        }
    }

    public void multiplication(double numtoMulti){
        if(!this.isError){
            this.displayValue *= numtoMulti;
        }
    }

    public void division(double numtoDiv){
        if(numtoDiv == 0){           //if input is 0, then there is an error, set value to 0 and display error msg
            this.isError = true;
            this.displayValue = 0;
            errorMessage();
        }else if(!this.isError){
            this.displayValue /= numtoDiv;
        }
    }

    public void squared(){
        if(!this.isError){
            this.displayValue = Math.pow(this.displayValue, 2);
        }
    }

    public void sqrt(){
        if(!this.isError){
            if(this.displayValue < 0){
                this.isError = true;
                this.displayValue = 0;
                errorMessage();
            }else{
                this.displayValue = Math.sqrt(this.displayValue);
            }
        }
    }

    public void exponentiation(double exponent){
        if(!this.isError){
            this.displayValue =Math.pow(this.displayValue, exponent);
        }
    }

    public void inverse(){
        if(!this.isError){
            if(this.displayValue == 0){
                this.isError = true;
                this.displayValue = 0;
                errorMessage();
            }else {
                this.displayValue = 1 / this.displayValue;
            }
        }
    }

    public void invertSign(){

        this.displayValue = -this.displayValue;
    }


}
