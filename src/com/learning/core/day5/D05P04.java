package com.learning.core.day5;

import java.util.HashSet;

class Product {
    private String productId;
    private String productName;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public int hashCode() {
        return productId.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return productId.equals(product.productId);
    }
}

public class D05P04 {
    public static void main(String[] args) {
        HashSet<Product> productSet = new HashSet<>();

        // Predefined information of 4 products
        productSet.add(new Product("P001", "Toyota Camry"));
        productSet.add(new Product("P002", "Honda Accord"));
        productSet.add(new Product("P003", "Maruti Dezire"));
        productSet.add(new Product("P004", "Ford Mustang"));

        // Search for a particular product
        String searchProductId = "P003";
        String searchProductId1 = "Maruti Dezire";
        
        boolean found = false;

        for (Product product : productSet) {
            if (product.getProductId().equals(searchProductId) && product.getProductName().equals(searchProductId1)) 
            {
                found = true;
                break;
            }
        }

        // Output
        if (found) {
            System.out.println("Product Found");
        } else {
            System.out.println("Product Not Found");
        }
    }
}