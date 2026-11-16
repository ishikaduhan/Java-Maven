
package com.example;

public class Calculator {

    // Addition
    public int add(int a, int b) {
        return a + b;
    }

    // Subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // Division
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException(
                "Cannot divide by zero."
            );
        }
        return a / b;
    }

    // Main method
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Calculator Maven Application");

        System.out.println("Addition: " + calc.add(10, 5));

        System.out.println("Subtraction: " + calc.subtract(10, 5));

        System.out.println("Multiplication: " + calc.multiply(10, 5));

        System.out.println("Division: " + calc.divide(10, 5));
    }
}