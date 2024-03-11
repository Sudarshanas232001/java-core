package com.learning.core.day6;

import java.util.*;

class Caar implements Comparable<Caar> {
    private String name;
    private double price;

    public Caar(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Caar car = (Caar) obj;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Caar other) {
        return Double.compare(this.price, other.price);
    }
}

public class D06P06 {
    public static void main(String[] args) {
        TreeMap<Car, String> carMap = new TreeMap<>(Collections.reverseOrder());

        carMap.put(new Car("Bugatti", 80050.0), "Luxury");
        carMap.put(new Car("Swift", 305000.0), "Compact");
        carMap.put(new Car("Audi", 600100.0), "Luxury");
        carMap.put(new Car("Benz", 900000.0), "Luxury");

        for (Car car : carMap.keySet()) {
            System.out.println(car);
        }
    }
}