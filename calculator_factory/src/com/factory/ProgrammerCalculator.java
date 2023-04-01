package com.factory;

public class ProgrammerCalculator implements Calculator {
    @Override
    public void calculate(double num1, double num2, String operator) {
        int result = 0;

        switch (operator) {
            case "AND":
                result = (int) num1 & (int) num2;
                break;
            case "OR":
                result = (int) num1 | (int) num2;
                break;
            case "XOR":
                result = (int) num1 ^ (int) num2;
                break;
        }
        System.out.println("Result: " + result);
    }
}

