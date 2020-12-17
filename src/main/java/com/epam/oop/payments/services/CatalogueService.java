package com.epam.oop.payments.services;

import com.epam.oop.payments.beans.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CatalogueService {
    public void sortByName(List<Product> products) {
        products.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
    }

    public void sortByPrice(List<Product> products) {
        products.sort((o1, o2) -> o1.getCost().subtract(o2.getCost()).intValue());
    }

    public void sortById(List<Product> products) {
        products.sort(Comparator.comparingInt(Product::getProductId));
    }

    public Product getById(List<Product> products, int id) {
        for (Product product : products) {
            if (product.getProductId() == id) {
                return product;
            }
        }
        return null;
    }

    public Product getByName(List<Product> products, String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public List<Product> getByPrice(List<Product> products, int minPrice, int maxPrice) {
        List<Product> selectedProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getCost().intValue() >= minPrice
                    && product.getCost().intValue() <= maxPrice) {
                selectedProducts.add(product);
            }
        }
        return selectedProducts;
    }
}
