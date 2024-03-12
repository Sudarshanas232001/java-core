package com.learning.core.day7;

import java.util.*;

class CheckEvenTopElement {
    public static boolean isEvenTop(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return false; // Stack is empty, so top element cannot be even
        }
        int topElement = stack.peek();
        return topElement % 2 == 0;
    }
}
class D07P07
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter space-separated integers to push onto the stack:");
        String input = scanner.nextLine();
        String[] values = input.split(" ");

        Stack<Integer> stack = new Stack<>();
        for (String value : values) {
            stack.push(Integer.parseInt(value));
        }
        
        Stack<Integer> tempStack = new Stack<>();
        while(!stack.isEmpty())
        {
        	tempStack.push(stack.pop());
        }
        stack = tempStack;
        
        boolean isTopEven = CheckEvenTopElement.isEvenTop(stack);
        System.out.println(isTopEven);
        scanner.close();
    }
}