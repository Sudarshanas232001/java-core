package com.learning.core.day6;

import java.util.Hashtable;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee(int id, String name, String department, String designation) {
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
        Employee employee = (Employee) obj;
        return id == employee.id;
    }
}

public class D06P13 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employeeHashtable = new Hashtable<>();
        Scanner scanner = new Scanner(System.in);


        // Predefined Employee objects
        Employee employee1 = new Employee(1001, "Daniel", "L&D", "Analyst");
        Employee employee2 = new Employee(1002, "Thomas", "Testing", "Tester");
        Employee employee3 = new Employee(1003, "Robert", "Development", "ProductionManager");
        Employee employee4 = new Employee(1004, "Grace", "HR", "TechSupport");

        // Add predefined employees to the Hashtable
        employeeHashtable.put(employee1.hashCode(), employee1);
        employeeHashtable.put(employee2.hashCode(), employee2);
        employeeHashtable.put(employee3.hashCode(), employee3);
        employeeHashtable.put(employee4.hashCode(), employee4);

        // Get the number of keys in the HashTable
        int numOfKeys = employeeHashtable.size();
        System.out.println(numOfKeys);
        
        System.out.println("Enter details of a new employee:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Designation: ");
        String designation = scanner.nextLine();

        // Create the new employee object
        Employee newEmployee = new Employee(id, name, department, designation);

        // Add the new employee if not already exists
        if (!employeeHashtable.containsKey(newEmployee.hashCode())) {
            employeeHashtable.put(newEmployee.hashCode(), newEmployee);
        }

        // Print all employees
        System.out.println("Employee details after adding:");
        for (Employee employee : employeeHashtable.values()) {
            System.out.println(employee);
            
        }
        int numKeys = employeeHashtable.size();
        System.out.println(numKeys);
    }
}