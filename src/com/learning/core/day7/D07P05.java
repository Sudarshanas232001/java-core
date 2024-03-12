package com.learning.core.day7;

import java.util.*;

class ReverseStackUsingRecursion {
    //static Stack<Integer> stack = new Stack<>();

    public static void reverseStack(Stack <Integer> stack) {
        if (!stack.isEmpty()) {
            int item = stack.pop();
            reverseStack(stack);
            insertAtBottom(stack,item);
        }
    }

    public static void insertAtBottom(Stack <Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            int temp = stack.pop();
            insertAtBottom(stack, item);
            stack.push(temp);
        }
    }
}

class D07P05
{
    public static void main(String[] args) {
    	Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter space-separated integers to push onto the stack:");
        String input = scanner.nextLine();
        String[] values = input.split(" ");

        for (String value : values) {
            stack.push(Integer.parseInt(value));
        }

        //System.out.println("Original stack: " + stack);
        ReverseStackUsingRecursion.reverseStack(stack);
        System.out.println(stack);
        scanner.close();
    }
}