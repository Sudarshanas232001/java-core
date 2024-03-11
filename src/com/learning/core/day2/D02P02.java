package com.learning.core.day2;
import java.util.Scanner;

public class D02P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int limit = scanner.nextInt();

        System.out.print("Even numbers less than or equal to " + limit + " are: ");


        for (int i = 2; i <= limit; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

}
