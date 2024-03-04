package com.zipcodewilmington.scientificcalculator;

public class Memory {
    double memory = 0;

    public Memory(Double memory){
        this.memory = memory;
    }
        public double getMemory() {
            return memory;
        }
        public void setMemory(double memory) {
            this.memory = memory;
        }
        public void clearMemory() {
            this.memory = 0;
        }
}

