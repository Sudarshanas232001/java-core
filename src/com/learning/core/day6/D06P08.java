package com.learning.core.day6;

import java.util.*;

class Carr implements Comparable<Carr> {
    private String name;
    private double price;

    public Carr(String name, double price) {
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
        Carr carr = (Carr) obj;
        return Double.compare(carr.price, price) == 0 && Objects.equals(name, carr.name);
    }

    @Override
    public int compareTo(Carr other) {
        return Double.compare(this.price, other.price);
    }
}

public class D06P08 {
    public static void main(String[] args) {
        TreeMap<Carr, String> carMap = new TreeMap<>();

        carMap.put(new Carr("Bugatti", 80050.0), "Luxury");
        carMap.put(new Carr("Swift", 305000.0), "Compact");
        carMap.put(new Carr("Audi", 600100.0), "Luxury");
        carMap.put(new Carr("Benz", 900000.0), "Luxury");

        Map.Entry<Carr, String> greatestPriceEntry = carMap.pollLastEntry();

        for (Carr car : carMap.keySet()) {
            System.out.println(car);
        }
    }
}