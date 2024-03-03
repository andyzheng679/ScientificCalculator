package com.zipcodewilmington.scientificcalculator;

public class Factorial {

    public long factorial(int n){

        int fact = 1;
        for(int i = 2 ; i <= n ; i++){
            fact = fact * i;
        }
        return fact;
    }

}
