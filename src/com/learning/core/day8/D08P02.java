package com.learning.core.day8;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queuee{
    private Node front, rear;

    public Queuee() {
        front = rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public void dequeue() {
        if (front == null) {
            return;
        }
        Node temp = front;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        temp = null;
    }

    public void display() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

class D08P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queuee queue = new Queuee();
        
        System.out.println("Enter the number of elements to enqueue:");
        int n = scanner.nextInt();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            queue.enqueue(element);
        }
        
        System.out.print("Elements in queue: ");
        queue.display();
        
        System.out.println("Enter the number of elements to dequeue:");
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            queue.dequeue();
        }
        
        System.out.print("After removing " + m + " elements: ");
        queue.display();
        
        scanner.close();
    }
}