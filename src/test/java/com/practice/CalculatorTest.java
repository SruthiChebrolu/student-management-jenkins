package com.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void shouldAddTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void shouldSubtractTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    void shouldDivideTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    void shouldCalculateModulus() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.modulus(10, 3));
    }

    @Test
    void shouldRejectModulusByZero() {
        Calculator calculator = new Calculator();

        assertThrows(
            IllegalArgumentException.class,
            () -> calculator.modulus(10, 0)
        );
    }
}