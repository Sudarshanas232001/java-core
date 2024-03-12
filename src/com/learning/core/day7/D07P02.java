package com.learning.core.day7;

import java.util.*;

class StackUsingLinkedList
{
    private LinkedList<Double> stack;

    public StackUsingLinkedList() {
        stack = new LinkedList<>();
    }

    public void push(double value) {
        stack.push(value);
    }

    public Double pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.pop();
    }

    public void display() {
        System.out.print("The elements of the stack are: ");
        for (Double value : stack) {
            System.out.print(value + " ");
        }
        System.out.println("null");
    }
}
class D07P02
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] values = input.split(" ");

        StackUsingLinkedList stack = new StackUsingLinkedList();
        for (String value : values) {
            stack.push(Double.parseDouble(value));
        }

        stack.display();

        stack.pop();
        stack.pop();

        System.out.print("After popping twice: ");
        stack.display();
        scanner.close();
    }
}