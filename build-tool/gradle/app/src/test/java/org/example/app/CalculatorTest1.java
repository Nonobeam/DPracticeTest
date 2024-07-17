package org.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest1 {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    void subtract() {
        assertEquals(1, calculator.subtract(2, 1));
    }
}