package it.unibo.collections.design2;

import java.util.Set;
import java.util.TreeSet;

import it.unibo.collections.design.WarehouseImpl;
import it.unibo.collections.design.api.Product;

public class OrderedWarehouse extends WarehouseImpl {

    /**
     * {@inheritDoc}
     */
    @Override
    public Set<Product> allProducts() {
        return new TreeSet<>(super.allProducts());
    }

}
