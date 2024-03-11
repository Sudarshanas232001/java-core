package com.learning.core.day6;

import java.util.Hashtable;

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
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'' +
                '}';
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

public class D06P10 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employeeHashtable = new Hashtable<>();

        // Create Employee objects
        Employee employee1 = new Employee(1, "John Doe", "Engineering", "Software Engineer");
        Employee employee2 = new Employee(2, "Jane Smith", "HR", "HR Manager");
        Employee employee3 = new Employee(3, "Alice Johnson", "Finance", "Financial Analyst");
        Employee employee4 = new Employee(4, "Bob Brown", "Marketing", "Marketing Coordinator");

        // Store employees in the HashTable
        employeeHashtable.put(employee1.hashCode(), employee1);
        employeeHashtable.put(employee2.hashCode(), employee2);
        employeeHashtable.put(employee3.hashCode(), employee3);
        employeeHashtable.put(employee4.hashCode(), employee4);

        // Check if the HashTable is empty
        boolean isEmpty = employeeHashtable.isEmpty();
        System.out.println(isEmpty);
    }
}