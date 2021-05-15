package com.company;

public class MagicCalculator extends Calculator{
    public double sqrt(double num){
        return Math.sqrt(num);
    }
    public double sin(double num){
        return Math.sin(num);
    }
    public double cos(double num){
        return Math.cos(num);
    }
    public double tan(double num){
        return Math.tan(num);
    }
    public int factorial(int num){
        if(num==0 || num==1){
            return 1;
        }
        return num*factorial(num-1);
    }
}
