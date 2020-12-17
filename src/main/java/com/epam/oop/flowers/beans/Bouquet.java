package com.epam.oop.flowers.beans;

import com.epam.oop.flowers.enums.FlowerKind;
import com.epam.oop.flowers.enums.Length;

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
