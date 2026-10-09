package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        }
    }
