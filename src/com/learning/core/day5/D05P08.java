package com.learning.core.day5;

import java.util.*;

class Persoon implements Comparable<Persoon> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Persoon(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Persoon persoon = (Persoon) obj;
        return id == persoon.id &&
                age == persoon.age &&
                Double.compare(persoon.salary, salary) == 0 &&
                Objects.equals(name, persoon.name);
    }

    @Override
    public int compareTo(Persoon o) {
        return Integer.compare(this.id, o.id);
    }
}

public class D05P08 {
    public static void main(String[] args) {
        TreeSet<Persoon> personSet = new TreeSet<>();

        // Predefined information of 6 persons
        personSet.add(new Persoon(1, "Jerry", 12, 999.0));
        personSet.add(new Persoon(2, "Smith", 22, 2999.0));
        personSet.add(new Persoon(3, "Popeye", 21, 5999.0));
        personSet.add(new Persoon(4, "Jones", 22, 6999.0));
        personSet.add(new Persoon(5, "John", 22, 6999.0));
        personSet.add(new Persoon(6, "Tom", 42, 3999.0));

        // Print all person details
        for (Persoon person : personSet) {
            System.out.println(person);
        }
    }
}