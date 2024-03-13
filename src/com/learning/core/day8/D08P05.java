package com.learning.core.day8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class D08P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements separated by space:");
        String input = scanner.nextLine();
        String[] elements = input.split(" ");

        Queue<Integer> originalQueue = new LinkedList<>();
        for (String element : elements) {
            originalQueue.offer(Integer.parseInt(element));
        }

        Queue<Integer>[] result = splitQueue(originalQueue);
        
        System.out.println("Odd Queue: " + result[0]);
        System.out.println("Even Queue: " + result[1]);

        scanner.close();
    }

    public static Queue<Integer>[] splitQueue(Queue<Integer> queue) {
        Queue<Integer> oddQueue = new LinkedList<>();
        Queue<Integer> evenQueue = new LinkedList<>();

        while (!queue.isEmpty()) {
            int num = queue.poll();
            if (num % 2 == 0) {
                evenQueue.offer(num);
            } else {
                oddQueue.offer(num);
            }
        }

        Queue<Integer>[] result = new Queue[2];
        result[0] = oddQueue;
        result[1] = evenQueue;
        return result;
    }
}