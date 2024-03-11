package com.learning.core.day5;

import java.util.HashSet;

class Prod {
    private int prodId;
    private String prodName;

    public Prod(int prodId, String prodName) {
        this.prodId = prodId;
        this.prodName = prodName;
    }

    public int getProdId() {
        return prodId;
    }

    public String getProdName() {
        return prodName;
    }

    @Override
    public int hashCode() {
        return prodId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Prod prod = (Prod) obj;
        return prodId == prod.prodId;
    }

    @Override
    public String toString() {
        return "Prod{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                '}';
    }
}

public class D05P05 {
    public static void main(String[] args) {
        HashSet<Prod> prodHashSet = new HashSet<>();

        // Predefined information of 4 prods
        prodHashSet.add(new Prod(1, "Maruthi 800"));
        prodHashSet.add(new Prod(2, "Maruthi Zen"));
        prodHashSet.add(new Prod(3, "Maruti Dezire"));
        prodHashSet.add(new Prod(4, "Maruthi Alto"));

        System.out.println("Initial HashSet:");
        for (Prod prod : prodHashSet) {
            System.out.println(prod);
        }

        // Remove a particular prod from the HashSet by using prod Id
        int prodIdToRemove = 2;
        Prod prodToRemove = null;
        for (Prod prod : prodHashSet) {
            if (prod.getProdId() == prodIdToRemove) {
                prodToRemove = prod;
                break;
            }
        }
        if (prodToRemove != null) {
            prodHashSet.remove(prodToRemove);
            System.out.println("\nHashSet after removing Prod with Id " + prodIdToRemove + ":");
            for (Prod prod : prodHashSet) {
                System.out.println(prod);
            }
        } else {
            System.out.println("\nProd with Id " + prodIdToRemove + " not found in HashSet.");
        }
    }
}