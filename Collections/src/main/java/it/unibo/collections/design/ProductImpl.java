package it.unibo.collections.design;

import it.unibo.collections.design.api.Product;

public class ProductImpl implements Product {

    private final String name;
    private double quantity;

    public ProductImpl(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public double getQuantity() {
        return this.quantity;
    }
    
    public boolean equals(ProductImpl product) {
        return this.name == product.name;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return this.name;
    }
}
