package com.factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Calculator calculator = CalculatorFactory.getCalculator(CalculatorMode.BASIC);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter operator: ");
        String operator = scanner.next();

        calculator.calculate(num1, num2, operator);
    }
}