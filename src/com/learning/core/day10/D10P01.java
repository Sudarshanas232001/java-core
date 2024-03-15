package com.learning.core.day10;

import java.io.*;

class D10P01 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileCopy <sourceFile> <destinationFile>");
            return;
        }

        String sourceFilePath = args[0];
        String destinationFilePath = args[1];

        File sourceFile = new File(sourceFilePath);
        File destinationFile = new File(destinationFilePath);

        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        if (destinationFile.exists()) {
            System.out.print("Destination file already exists. Do you want to overwrite? (Yes/No): ");
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                String choice = reader.readLine();
                if (!choice.equalsIgnoreCase("yes")) {
                    System.out.println("File copy operation aborted.");
                    return;
                }
            } catch (IOException e) {
                System.out.println("Error reading user input.");
                return;
            }
        }

        try (InputStream inputStream = new FileInputStream(sourceFile);
             OutputStream outputStream = new FileOutputStream(destinationFile)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}