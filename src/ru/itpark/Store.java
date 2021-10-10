package ru.itpark;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<Product>();

    public void add(Product product) {
        for (Product item : products) {
            if (item.getId() == product.getId());
            throw new IllegalArgumentException("Продукт с таким ID уже существует");
        }
        products.add(product);
    }

    public List<Product> getAll() {
        return products;
    }
}
