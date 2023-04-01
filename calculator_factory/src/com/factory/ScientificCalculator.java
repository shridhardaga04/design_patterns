package com.factory;

public class ScientificCalculator implements Calculator {
    @Override
    public void calculate(double num1, double num2, String operator) {
        double result = 0;

        switch (operator) {
            case "sin":
                result = Math.sin(num1);
                break;
            case "cos":
                result = Math.cos(num1);
                break;
            case "tan":
                result = Math.tan(num1);
                break;
        }
        System.out.println("Result: " + result);
    }
}
