package com.learning.day3;

import java.util.Scanner;

public class D03P01 {
	
    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            
            left++;
            right--;
        }
        return true;
    }

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Display length of the string
        int length = input.length();
        System.out.println("Length of the string: " + length);
        
        // Display string in uppercase
        String uppercaseString = input.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseString);
        
        // Check if the string is a palindrome
        boolean isPalindrome = checkPalindrome(input);
        if(isPalindrome)
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string is not a palindrome.");
        
        scanner.close();
    }
}