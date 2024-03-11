package com.learning.core.day2;

import java.util.Scanner;

public class D02P16 {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int numTerms = sc.nextInt();
        System.out.println("Fibonacci Series up to " + numTerms + " terms:");
        for (int i = 0; i < numTerms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}