package com.epam.oop.flowers.beans;

import com.epam.oop.flowers.enums.FlowerKind;
import com.epam.oop.flowers.enums.Length;

import java.math.BigDecimal;

public class GardenFlower implements Flower {
    private final FlowerKind kind;
    private final Length length;
    private BigDecimal price;

    public GardenFlower(FlowerKind kind, Length length, BigDecimal price) {
        this.kind = kind;
        this.length = length;
        this.price = price;
    }

    public FlowerKind getKind() {
        return kind;
    }

    public Length getLength() {
        return length;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nFlower{" +
                "kind=" + kind +
                ", length=" + length +
                '}';
    }
}
