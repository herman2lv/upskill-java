package com.epam.oop.flowersShop.beans;

import com.epam.oop.flowersShop.enums.FlowerKind;
import com.epam.oop.flowersShop.enums.Length;

import java.math.BigDecimal;
import java.util.List;

public interface Bouquet {
    List<Flower> getFlowers();
    Wrapping getWrapping();
    void setWrapping(Wrapping wrapping);
    void addFlower(Flower flower);
    void removeFlower(FlowerKind kind, Length length);
    BigDecimal getCost();
    String getInfo();

}
