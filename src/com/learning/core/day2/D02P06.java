package com.learning.core.day2;

import java.util.Scanner;

public class D02P06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the week number (1-7): ");
        int weekNumber = scanner.nextInt();

        if (weekNumber == 1) {
            System.out.println("Monday");
        } else if (weekNumber == 2) {
            System.out.println("Tuesday");
        } else if (weekNumber == 3) {
            System.out.println("Wednesday");
        } else if (weekNumber == 4) {
            System.out.println("Thursday");
        } else if (weekNumber == 5) {
            System.out.println("Friday");
        } else if (weekNumber == 6) {
            System.out.println("Saturday");
        } else if (weekNumber == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
    }
}