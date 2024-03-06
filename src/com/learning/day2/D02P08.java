package com.learning.day2;

import java.util.Scanner;

public class D02P08 {
    public static int sum(int n ){
        return n * (n+1)/2;
    }
    public static int sumRange(int l, int r ){
        return sum(r) - sum(l -1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower bound of the range: ");
        int L = scanner.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int R = scanner.nextInt();
        int res = sumRange(L,R);

        System.out.println("Sum of elements from " + res);
    }
}