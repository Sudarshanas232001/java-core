package com.learning.day5;

import java.util.HashSet;

class Production {
    private String productionId;
    private String productionName;

    public Production(String productionId, String productionName) {
        this.productionId = productionId;
        this.productionName = productionName;
    }

    public String getProductionId() {
        return productionId;
    }

    public String getProductionName() {
        return productionName;
    }

    @Override
    public String toString() {
        return productionId + " " + productionName;
    }
}

public class D05P03 {
    public static void main(String[] args) {
        HashSet<Production> productions = new HashSet<>();

        // Predefined information of 4 productions
        productions.add(new Production("P001", "Maruthi 800"));
        productions.add(new Production("P002", "Maruthi Zen"));
        productions.add(new Production("P003", "Maruthi Dezire"));
        productions.add(new Production("P004", "Maruthi Alto"));

        // List all the production details
        System.out.println("Production Details:");
        for (Production production : productions) {
            System.out.println(production);
        }
    }
}
