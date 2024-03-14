package com.learning.core.day9;

import java.util.Scanner;

class D09P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Element to search
        int key = scanner.nextInt();

        // Perform linear search
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }

        // Output result
        if (found) {
            System.out.println("Element is present");
        } else {
            System.out.println("Element is not present");
        }
    }
}