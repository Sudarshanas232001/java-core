package com.learning.core.day5;

import java.util.*;

class Persun implements Comparable<Persun> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Persun(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Persun persun = (Persun) obj;
        return id == persun.id;
    }

    @Override
    public int compareTo(Persun other) {
        return Integer.compare(this.id, other.id);
    }
}
public class D05P07 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Persun> personSet = new TreeSet<>();

        // Taking input for 6 persons
        for (int i = 1; i <= 6; i++) {
            System.out.println("Enter details for person " + i + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            personSet.add(new Persun(id, name, age, salary));
        }

        // Printing id, name, and salary of each person
        for (Persun persun : personSet) {
            System.out.printf("%d %s %.1f\n", persun.getId(), persun.getName(), persun.getSalary());
        }
    }
}