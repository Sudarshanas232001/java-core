package com.learning.day2;

import java.util.Scanner;

public class D02P01 {
    static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        if (num >= 1 && num <= 12) {

            System.out.println("The month is " + months[num-1]);
        } else {

            System.out.println("Invalid number. Please try again.");
        }


        sc.close();
    }
}