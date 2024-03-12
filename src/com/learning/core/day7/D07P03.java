package com.learning.core.day7;

import java.util.*;

class ReverseStringUsingStack {
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        // Pop characters from the stack to form the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
class D07P03
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String input = scanner.nextLine();
        String reversed = ReverseStringUsingStack.reverseString(input);
        System.out.println("Reversed string: " + reversed);
        scanner.close();
    }
}