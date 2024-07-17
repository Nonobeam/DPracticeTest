package org.example.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest2 {

    Calculator calculator = new Calculator();

    @Test
    void multiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void divide() {
        assertEquals(2, calculator.divide(6, 3));
    }
}