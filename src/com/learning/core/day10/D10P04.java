package com.learning.core.day10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class D10P04 {
    public static void main(String[] args) {
        // Source and destination file paths
        Path source = Paths.get("E:\\sudhi\\sudarshan_a_s");
        Path destination = Paths.get("E:\\sudhi\\sudarshan_a_s");
        
        try {
            // Copy contents from source to destination
            Files.copy(source, destination);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }
    }
}
