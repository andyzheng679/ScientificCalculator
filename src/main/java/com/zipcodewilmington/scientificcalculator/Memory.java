package com.zipcodewilmington.scientificcalculator;

public class Memory {
    double memory = 0;
        public double GetMemory() {
            return memory;
        }
        public void SetMemory(double memory) {
            this.memory = memory;
        }
        public void ClearMemory() {
            this.memory = 0;
        }

}