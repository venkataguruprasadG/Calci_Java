package com.calc.service;

import java.util.Locale;

public class operationExe{
    public double execute(double num1, double num2,String operation){
        switch (operation.toLowerCase().trim()){
            case "add":
                return num1 + num2;
            case "sub":
                return num1 - num2;
            case "mul":
                return num1 * num2;
            case "div":
                if (num2 == 0){
                    return Double.NaN;
                }
                return num1 / num2;
            default:
                return Double.MIN_VALUE;
        }
    }
}