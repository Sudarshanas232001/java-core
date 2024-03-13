package com.learning.core.day8;

import java.util.Scanner;

class Queue {
    private int front, rear, capacity;
    private int[] queue;

    public Queue(int c) {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    public void enqueue(int data) {
        if (rear == capacity) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear++] = data;
    }

    public void dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }
        if (rear < capacity)
            queue[rear] = 0;
        rear--;
    }

    public void display() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        //System.out.print("Elements in queue: ");
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

class D08P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the queue: ");
        int capacity = scanner.nextInt();
        Queue queue = new Queue(capacity);

       /* System.out.println("Enter elements to enqueue (type -1 to stop):");
        int data;
        while ((data = scanner.nextInt()) != -1) {
            queue.enqueue(data);
        }*/
        int data;
        for(int i=0;i<capacity;i++)
        {
        	data = scanner.nextInt();
        	queue.enqueue(data);
        }
        System.out.print("Elements in queue: ");
        
        queue.display();

        System.out.print("After removing the first element:");
        queue.dequeue();
        queue.display();

        scanner.close();
    }
}