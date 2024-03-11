package com.learning.core.day3;

public class D03P03 {

	   public static void main(String[] args) {
	        int A[] = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};

	        // Compute sum of elements from index 0 to 14 and store it at element 15
	        int sum = 0;
	        for (int i = 0; i <= 14; i++) {
	            sum += A[i];
	        }
	        A[15] = sum;

	        // Compute average of all numbers and store it at element 16
	        double average = (double) sum / A.length;
	        A[16] = (int) average;

	        // Identify the smallest value from the array and store it at element 17
	        int min = A[0];
	        for (int i = 1; i < A.length - 1; i++) {
	            if (A[i] < min) {
	                min = A[i];
	            }
	        }
	        A[17] = min;

	        // Print the updated array
	        System.out.println("Updated array:");
	        for (int i = 0; i < A.length; i++) {
	            System.out.print(A[i] + " ");
	        }
	    }
}