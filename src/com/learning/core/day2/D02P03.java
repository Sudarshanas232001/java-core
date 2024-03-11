package com.learning.core.day2;
import java.util.Scanner;
public class D02P03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        double result = calculate(number1, operator, number2);

        if (Double.isNaN(result)) {
            System.out.println("Invalid operator or division by zero.");
        } else {
            System.out.println("Result: " + result);
        }
    }

    public static double calculate(double number1, char operator, double number2) {
        switch (operator) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                if (number2 == 0) {
                    return Double.NaN;
                }
                return number1 / number2;
            default:
                return Double.NaN;
        }
    }
}