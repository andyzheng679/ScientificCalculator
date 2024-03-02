package com.zipcodewilmington.scientificcalculator;

public class ScientificCalculator {
    private double displayValue = 0;    //default value is 0
    private boolean isError = false;   //default value is false

    public ScientificCalculator(double displayValue){   //constructor
        this.displayValue = 0;
    }

    public double getDisplayValue(){    //getting current display value
        return displayValue;
    }

    public void clearDisplayValue(){    //setting display value back to 0 and error to false "clearing it"
        displayValue = 0;
        isError = false;
    }

    public void changeDisplay(double newDisplayValue){ //setting the display to a num
        if(!isError){
            displayValue = newDisplayValue;
        }
    }

    public void errorMessage(){
        System.out.println("ERROR");
    }

    public void addition(double numtoAdd){
        if(!isError){
            displayValue += numtoAdd;
        }
    }

    public void subtraction(double numtoSub){
        if(!isError){
            displayValue -= numtoSub;
        }
    }

    public void multiplication(double numtoMulti){
        if(!isError){
            displayValue *= numtoMulti;
        }
    }

    public void division(double numtoDiv){
        if(numtoDiv == 0){           //if input is 0, then there is an error, set value to 0 and display error msg
            isError = true;
            displayValue = 0;
            errorMessage();
        }else if(!isError){
            displayValue /= numtoDiv;
        }
    }

    public void squared(double numtosquare){
        if(!isError){
            displayValue = Math.pow(displayValue, 2);
        }
    }

    public void sqrt(double sqrtNum){
        if(!isError){
            if(sqrtNum < 0){
                isError = true;
                displayValue = 0;
                errorMessage();
            }else{
                displayValue = Math.sqrt(sqrtNum);
            }
        }
    }

    public void exponentiation(double exponent){
        if(!isError){
            displayValue =Math.pow(displayValue, exponent);
        }
    }

    public void inverse(double num){
        if(!isError){
            if(num == 0){
                isError = true;
                displayValue = 0;
                errorMessage();
            }else {
                displayValue = 1 / num;
            }
        }
    }

    public void invertSign(double numtoInvert){
        displayValue = -numtoInvert;
    }


}
