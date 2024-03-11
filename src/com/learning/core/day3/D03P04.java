package com.learning.core.day3;

import java.util.*;

public class D03P04 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int N = scanner.nextInt();
        
        int[] arr = new int[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        int firstIndex = -1;
        
        for (int i = 0; i < N; i++) {
            if (map.containsKey(arr[i])) {
                firstIndex = map.get(arr[i]);
                break;
            } else {
                map.put(arr[i], i);
            }
        }
        
        if (firstIndex == -1) {
            System.out.println("No repeating element found.");
        } else {
            System.out.println("Index of first repeating element: " + firstIndex);
        }
    }
}