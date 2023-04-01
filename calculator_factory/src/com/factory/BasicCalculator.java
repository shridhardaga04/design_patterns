package com.factory;

public class BasicCalculator implements Calculator {
    @Override
    public void calculate(double num1, double num2, String operator) {
        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        System.out.println("Result: " + result);
    }
}
