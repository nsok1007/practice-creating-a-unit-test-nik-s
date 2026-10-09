package org.example;

public class Calculator {
    public static double add(double a, double b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
           default: throw new ArithmeticException();
        }
    }
}
