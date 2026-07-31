package com.practice;

public class Calculator {

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        return firstNumber / secondNumber;
    }

    public int modulus(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            throw new IllegalArgumentException("Cannot calculate modulus by zero");
        }

        return firstNumber % secondNumber;
    }
}