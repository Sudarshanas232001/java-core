package com.learning.core.day6;

import java.util.Hashtable;

class Empployee {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Empployee(int id, String name, String department, String designation) {
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
        Empployee employee = (Empployee) obj;
        return id == employee.id;
    }
}

public class D06P14 {
    public static void main(String[] args) {
        Hashtable<Integer, Empployee> currentCollection = new Hashtable<>();
        Hashtable<Integer, Empployee> specificCollection = new Hashtable<>();

        // Predefined Employee objects in the current collection
        Empployee employee1 = new Empployee(1001, "Daniel", "L&D", "Analyst");
        Empployee employee2 = new Empployee(1002, "Thomas", "Testing", "Tester");
        Empployee employee3 = new Empployee(1003, "Robert", "Development", "ProductionManager");
        Empployee employee4 = new Empployee(1004, "Grace", "HR", "TechSupport");

        // Add predefined employees to the current collection
        currentCollection.put(employee1.hashCode(), employee1);
        currentCollection.put(employee2.hashCode(), employee2);
        currentCollection.put(employee3.hashCode(), employee3);
        currentCollection.put(employee4.hashCode(), employee4);

        // Add some data to the specific collection
        specificCollection.put(1005, new Empployee(1005, "Charles", "Testing", "QALead"));
        specificCollection.put(1006, new Empployee(1006, "Henry", "Finance", "Accountant"));

        // Add employee details from the current collection to the specific collection
        specificCollection.putAll(currentCollection);

        // Print the combined employee details
        for (Empployee employee : specificCollection.values()) {
            System.out.println(employee);
        }
    }
}