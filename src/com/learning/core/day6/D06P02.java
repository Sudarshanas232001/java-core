package com.learning.core.day6;

import java.util.HashMap;

public class D06P02 {
    public static void main(String[] args) {
        // Create a HashMap to store phone book details
        HashMap<String, String> phoneBook = new HashMap<>();

        // Predefined information of 5 phone book details
        phoneBook.put("Amal", "998787823");
        phoneBook.put("Manvitha", "937843978");
        phoneBook.put("Joseph", "7882221113");
        phoneBook.put("Smith", "8293893311");
        phoneBook.put("Kathe", "7234560011");

        // Search for a phone number
        String nameToSearch = "Joseph";
        String phoneNumber = searchPhoneNumber(phoneBook, nameToSearch);
        if (phoneNumber != null) {
            System.out.println(/*"Phone number of " + nameToSearch + " is: " +*/ phoneNumber);
        } else {
            System.out.println("No phone number found for " + nameToSearch);
        }
    }

    // Method to search for a phone number by name
    private static String searchPhoneNumber(HashMap<String, String> phoneBook, String name) {
        return phoneBook.get(name);
    }
}