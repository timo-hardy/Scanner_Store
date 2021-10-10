package ru.itpark;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<Product>();

    public void add(Product product) {
        products.add(product);
    }

    public List<Product> getAll() {
        return products;
    }
}
