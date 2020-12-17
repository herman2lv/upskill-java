package com.epam.oop.payments.beans;

import java.math.BigDecimal;

public class Product {
    private static final int ID_INITIAL_VALUE = 1;
    private static int idCounter = ID_INITIAL_VALUE;
    private final int productId;
    private String name;
    private String description;
    private BigDecimal cost;

    {
        productId = idCounter++;
    }

    public Product(String name, BigDecimal cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public int getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return "\nProduct{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                '}';
    }
}
