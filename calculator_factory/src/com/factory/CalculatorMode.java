package com.factory;

import java.util.function.Supplier;

public enum CalculatorMode {
    BASIC(BasicCalculator::new),
    SCIENTIFIC(ScientificCalculator::new),
    PROGRAMMER(ProgrammerCalculator::new);

    CalculatorMode(Supplier<Calculator> constructor) {
        this.constructor = constructor;
    }

    public Supplier<Calculator> getConstructor() {
        return constructor;
    }

    private final Supplier<Calculator> constructor;

}
