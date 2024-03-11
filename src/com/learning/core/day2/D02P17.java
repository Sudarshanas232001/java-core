package com.learning.core.day2;

import java.util.Scanner;

public class D02P17 {

    public boolean isPrime(int num){
        if(num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if(num % 2 == 0 || num % 3 == 0){
            return false;
        }
        for(int i = 5; i<=  num ;i++){
            if(num % i == 0)
                return true;

        }


        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();
        D02P17 obj = new D02P17();
        for(int i = 2 ;i< n ;i++){
            if(obj.isPrime(i)){
                System.out.println(i + " ");
            }
        }
    }


}