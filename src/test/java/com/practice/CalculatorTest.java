package com.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import src.main.java.com.practice.Calculator;

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
void shouldDivideTwoNumbers() {
    Calculator calculator = new Calculator();

    assertEquals(5, calculator.divide(10, 2));
}
}