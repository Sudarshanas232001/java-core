package com.learning.core.day6;

import java.util.*;

class Caaar implements Comparable<Caaar> {
    private String name;
    private double price;

    public Caaar(String name, double price) {
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
        Caaar car = (Caaar) obj;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Caaar other) {
        return Double.compare(this.price, other.price);
    }
}

public class D06P07 {
    public static void main(String[] args) {
        TreeMap<Caaar, String> carMap = new TreeMap<>();

        carMap.put(new Caaar("Bugatti", 80050.0), "Luxury");
        carMap.put(new Caaar("Swift", 305000.0), "Compact");
        carMap.put(new Caaar("Audi", 600100.0), "Luxury");
        carMap.put(new Caaar("Benz", 900000.0), "Luxury");

        Map.Entry<Caaar, String> leastPriceEntry = carMap.firstEntry();
        Map.Entry<Caaar, String> greatestPriceEntry = carMap.lastEntry();

        System.out.println(leastPriceEntry.getKey());
        System.out.println(greatestPriceEntry.getKey());
    }
}