package com.learning.day3;

import java.util.Scanner;

public class D03P02 {
    	 public static void main(String[] args) {
    	        Scanner scanner = new Scanner(System.in);
    	        
    	        // Accepting two numbers from the user
    	        System.out.println("Enter two numbers in the range from 1 to 40:");
    	        int num1 = scanner.nextInt();
    	        int num2 = scanner.nextInt();
    	        
    	        // Accepting the array of five integer elements from the user
    	        int[] array = new int[5];
    	        System.out.println("Enter five numbers in the range from 1 to 40:");
    	        for (int i = 0; i < 5; i++) {
    	            array[i] = scanner.nextInt();
    	        }
    	        
    	        boolean foundNum1 = false;
    	        boolean foundNum2 = false;
    	        for(int i=0;i<5;i++)
    	        {
    	        	if(num1==array[i]) {
    	        		foundNum1 = true;
    	        	}
    	        	if(num2==array[i]) {
    	        		foundNum2 = true;
    	        	}
    	        }
    	        
    	        // Displaying the result
    	        if (foundNum1 && foundNum2) {
    	            System.out.println("Bingo");
    	        } else {
    	            System.out.println("Not Found");
    	        }
    	        
    	        scanner.close();
    	    }

}