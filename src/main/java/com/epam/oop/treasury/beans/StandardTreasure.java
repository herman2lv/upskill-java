package com.epam.oop.treasury.beans;

import java.math.BigDecimal;

public class StandardTreasure implements Treasure {
    private final static int ID_INITIAL_VALUE = 1;
    private static int idCounter = ID_INITIAL_VALUE;
    private final int treasureId;
    private String name;
    private BigDecimal price;

    {
        treasureId = idCounter++;
    }

    public StandardTreasure(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getTreasureId() {
        return treasureId;
    }

    @Override
    public String toString() {
        return "\nTreasure{" +
                "treasureId=" + treasureId +
                ", name='" + name + '\'' +
                ", price=" + price +
                " USD}";
    }
}
