package com.epam.oop.flowersShop.beans;

import com.epam.oop.flowersShop.enums.FlowerKind;
import com.epam.oop.flowersShop.enums.Length;

import java.math.BigDecimal;

public interface Flower {
    FlowerKind getKind();
    Length getLength();
    BigDecimal getPrice();
    void setPrice(BigDecimal price);

}
