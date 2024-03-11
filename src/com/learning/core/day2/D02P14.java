package com.learning.core.day2;

import java.util.Scanner;

public class D02P14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base and exponent");
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int res = 1;
        for (int i = 1; i <= exponent; i++) {
            res = res * base;
        }
        System.out.println("result "+res);
    }
}