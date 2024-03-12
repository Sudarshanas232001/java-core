package com.learning.core.day7;

import java.util.*;

class MinElementInStack {
    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> minStack = new Stack<>();

    public static void push(int value) {
        stack.push(value);
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    public static void pop() {
        if (!stack.isEmpty()) {
            int value = stack.pop();
            if (value == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    public static int getMin() {
        return minStack.peek();
    }
}

public class D07P06
{
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter space-separated integers to push onto the stack:");
        String input = scanner.nextLine();
        String[] values = input.split(" ");

        for (String value : values) {
        	MinElementInStack.push(Integer.parseInt(value));
        }

        System.out.println(MinElementInStack.getMin());
        scanner.close();
    }
}