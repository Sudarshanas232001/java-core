package com.learning.core.day6;

import java.util.*;

class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString method override
    @Override
    public String toString() {
        return name + " " + price;
    }

    // hashCode method override
    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    // equals method override
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Car car = (Car) obj;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    // compareTo method override for natural ordering
    @Override
    public int compareTo(Car o) {
        return Double.compare(this.price, o.price);
    }
}

public class D06P09 {
    public static void main(String[] args) {
        // Predefined information of 4 Car details
        TreeMap<Car, String> carMap = new TreeMap<>();
        carMap.put(new Car("Bugatti", 80050.0), "Bugatti details");
        carMap.put(new Car("Swift", 305000.0), "Swift details");
        carMap.put(new Car("Audi", 600100.0), "Audi details");
        carMap.put(new Car("Benz", 900000.0), "Benz details");

        // Print the original map
        System.out.println("Original TreeMap:");
        for (Map.Entry<Car, String> entry : carMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Replace the value mapped by the specified key with the new value
        double newPrice = 80050.0;
        Car keyCar = new Car("Reva", 80050.0);
        carMap.replace(keyCar, "Reva " + newPrice);

        // Print the updated map
        System.out.println("\nUpdated TreeMap:");
        for (Map.Entry<Car, String> entry : carMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
