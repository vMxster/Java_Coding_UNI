package it.unibo.collections.design2;

import java.lang.String;
import it.unibo.collections.design.ProductImpl;
import it.unibo.collections.design.api.Product;

public class ComparableProduct implements Comparable<Product>, Product {

    private final Product product;

    public ComparableProduct(String name, double quantity) {
        this.product = new ProductImpl(name, quantity);
    }

    public int compareTo (Product o) {
        return this.product.getName().compareTo(o.getName());
    }

    public String getName() {
        return product.getName();
    }

    public double getQuantity() {
        return product.getQuantity();
    }

    public String toString() {
        return product.getName();
    }
}
