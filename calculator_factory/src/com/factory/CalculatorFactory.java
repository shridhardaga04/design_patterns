package com.factory;

public class CalculatorFactory {

    public static Calculator getCalculator(CalculatorMode mode) {
        return mode.getConstructor().get();
    }
}
