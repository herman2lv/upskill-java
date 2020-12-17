package com.epam.oop.payments.dao;

import com.epam.oop.payments.beans.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopDAO {
    List<Product> catalogue = new ArrayList<>();

    public ShopDAO() {
        catalogue.add(new Product("Cognac", BigDecimal.valueOf(14.99)));
        catalogue.add(new Product("Vodka", BigDecimal.valueOf(8.99)));
        catalogue.add(new Product("Wine", BigDecimal.valueOf(12.20)));
        catalogue.add(new Product("Whiskey", BigDecimal.valueOf(13.99)));
        catalogue.add(new Product("Rum", BigDecimal.valueOf(21.80)));
        catalogue.add(new Product("Balsam", BigDecimal.valueOf(11.65)));
    }

    public List<Product> getCatalogue() {
        return catalogue;
    }
}
