package com.epam.oop.flowersShop.creators;

import com.epam.oop.flowersShop.beans.Flower;
import com.epam.oop.flowersShop.beans.GardenFlower;
import com.epam.oop.flowersShop.enums.FlowerKind;
import com.epam.oop.flowersShop.enums.Length;

import java.math.BigDecimal;

public class GardenFlowerCreator implements FlowerCreator {
    @Override
    public Flower createFlower(FlowerKind kind, Length length, BigDecimal price) {
        return new GardenFlower(kind, length, price);
    }
}
