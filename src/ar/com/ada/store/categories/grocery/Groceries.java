package ar.com.ada.store.categories.grocery;

import ar.com.ada.store.Product;

import java.io.DataOutput;

public abstract class Groceries extends Product {
    protected final Double discountRate = 0.10;

    public Groceries(String productName, Double listPrice) {
        super (productName, listPrice);
    }

    public Double calculateDiscount;
}
