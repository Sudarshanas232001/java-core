package com.learning.core.day6;

import java.util.Hashtable;
import java.util.Scanner;

class Employeee {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employeee(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    // Override toString method
    @Override
    public String toString() {
        return id + " " + name + " " + department + " " + designation;
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return id;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employeee employee = (Employeee) obj;
        return id == employee.id;
    }
}

public class D06P11 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employeeHashtable = new Hashtable<>();

        // Create Employee objects
        Employee employee1 = new Employee(1001, "John Doe", "Engineering", "Software Engineer");
        Employee employee2 = new Employee(1002, "Jane Smith", "HR", "HR Manager");
        Employee employee3 = new Employee(1003, "Robert", "ProductionManager", "Development");
        Employee employee4 = new Employee(1004, "Alice Johnson", "Finance", "Financial Analyst");

        // Store employees in the HashTable
        employeeHashtable.put(employee1.hashCode(), employee1);
        employeeHashtable.put(employee2.hashCode(), employee2);
        employeeHashtable.put(employee3.hashCode(), employee3);
        employeeHashtable.put(employee4.hashCode(), employee4);

        // Prompt the user to input an employee ID
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee ID to search: ");
        int searchId = scanner.nextInt();
        
        // Search for the employee
        Employee foundEmployee = employeeHashtable.get(searchId);
        
        // Print the details of the found employee if found
        if (foundEmployee != null) {
            System.out.println("Employee found:");
            System.out.println(foundEmployee);
        } else {
            System.out.println("Employee not found.");
        }
    }
}