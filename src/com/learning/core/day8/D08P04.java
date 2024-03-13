package com.learning.core.day8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class D08P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements separated by space:");
        String input = scanner.nextLine().trim();
        String[] elements = input.split(" ");

        Queue<String> queue = new LinkedList<>();
        for (String element : elements) {
            if (!element.equals("")) {
                queue.offer(element);
            }
        }

        if (queue.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println("Not Empty");
        }

        scanner.close();
    }
}