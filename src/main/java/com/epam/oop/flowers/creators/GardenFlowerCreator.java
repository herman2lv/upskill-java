package com.epam.oop.flowers.creators;

import com.epam.oop.flowers.beans.Flower;
import com.epam.oop.flowers.beans.GardenFlower;
import com.epam.oop.flowers.enums.FlowerKind;
import com.epam.oop.flowers.enums.Length;

import java.math.BigDecimal;

public class GardenFlowerCreator implements FlowerCreator {
    @Override
    public Flower createFlower(FlowerKind kind, Length length, BigDecimal price) {
        return new GardenFlower(kind, length, price);
    }
}
