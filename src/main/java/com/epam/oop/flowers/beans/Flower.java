package com.epam.oop.flowers.beans;

import com.epam.oop.flowers.enums.FlowerKind;
import com.epam.oop.flowers.enums.Length;

import java.math.BigDecimal;

public interface Flower {
    FlowerKind getKind();
    Length getLength();
    BigDecimal getPrice();
    void setPrice(BigDecimal price);

}
