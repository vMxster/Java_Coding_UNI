package it.unibo.collections.design;

import java.util.HashSet;
import java.util.Set;
import it.unibo.collections.design.api.*;

public class WarehouseImpl implements Warehouse {

    private final Set<Product> products;

    public WarehouseImpl () {
        this.products = new HashSet<Product>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public Set<String> allNames() {
        Set<String> productNames = new HashSet<String>();
        for (final Product i : products) {
            productNames.add(i.toString());
        }
        return productNames;
    }

    public Set<Product> allProducts() {
        return new HashSet<>(Set.copyOf(this.products));
    }

    public boolean containsProduct(Product p) {
        for (final Product i : products) {
            if (i.equals(p)) {
                return true;
            }
        }
        return false;
    }

    public double getQuantity(String name) {
        for (final Product i : products) {
            if (i.equals(name)) {
                return i.getQuantity();
            }
        }
        return 0;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((products == null) ? 0 : products.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WarehouseImpl other = (WarehouseImpl) obj;
        if (products == null) {
            if (other.products != null)
                return false;
        } else if (!products.equals(other.products))
            return false;
        return true;
    }
}
