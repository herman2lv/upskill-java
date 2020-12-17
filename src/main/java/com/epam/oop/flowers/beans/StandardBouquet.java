package com.epam.oop.flowers.beans;

import com.epam.oop.flowers.enums.FlowerKind;
import com.epam.oop.flowers.enums.Length;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StandardBouquet implements Bouquet {
    private final List<Flower> flowers = new ArrayList<>();
    private Wrapping wrapping;

    public List<Flower> getFlowers() {
        return flowers;
    }

    public Wrapping getWrapping() {
        return wrapping;
    }

    public void setWrapping(Wrapping wrapping) {
        this.wrapping = wrapping;
    }

    @Override
    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    @Override
    public void removeFlower(FlowerKind kind, Length length) {
        flowers.removeIf(flower -> flower.getLength().equals(length) && flower.getKind().equals(kind));
    }

    @Override
    public BigDecimal getCost() {
        List<Flower> flowers = this.flowers;
        BigDecimal sum = new BigDecimal(0);
        for (Flower flower : flowers) {
            sum = sum.add(flower.getPrice());
        }
        if (wrapping != null) {
            sum = sum.add(wrapping.getPrice());
        }
        return sum;
    }

    @Override
    public String getInfo() {
        String info = toString();
        return info + "\nTotal cost = " + getCost() + " USD";
    }

    @Override
    public String toString() {
        return "Bouquet{" + flowers + wrapping + '}';
    }
}
