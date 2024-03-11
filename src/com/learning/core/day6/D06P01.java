package com.learning.core.day6;

import java.util.HashMap;

public class D06P01 {
    public static void main(String[] args) {
        // Create a HashMap to store phone book details
        HashMap<String, String> phoneBook = new HashMap<>();

        // Predefined information of 5 phone book details
        phoneBook.put("Amal", "998787823");
        phoneBook.put("Manvitha", "937843978");
        phoneBook.put("Joseph", "7882221113");
        phoneBook.put("Smith", "8293893311");
        phoneBook.put("Kathe", "7234560011");

        // List all the phone book details
        for (String name : phoneBook.keySet()) {
            String phoneNumber = phoneBook.get(name);
            System.out.println(name + " " + phoneNumber);
        }
    }
}