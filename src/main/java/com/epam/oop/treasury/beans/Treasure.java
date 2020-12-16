package com.epam.oop.treasury.beans;

import java.math.BigDecimal;

public interface Treasure {
    int getTreasureId();
    String getName();
    void setName(String name);
    BigDecimal getPrice();
    void setPrice(BigDecimal price);
}
