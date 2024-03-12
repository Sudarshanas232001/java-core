package com.learning.core.day7;

class StackUsingArray {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public StackUsingArray(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1;
    }

    public void push(String value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack overflow!");
        }
    }

    public String pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            return null;
        }
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
    
}
public class D07P01
	{
		public static void main(String[] args)
		{
			StackUsingArray stack = new StackUsingArray(5);
			stack.push("Hello");
			stack.push("world");
			stack.push("java");
			stack.push("Programming");

			System.out.print("After Pushing 4 Elements: ");
			stack.display();
    
			System.out.print("After a Pop : ");
			stack.pop();
			stack.display();
		}
}