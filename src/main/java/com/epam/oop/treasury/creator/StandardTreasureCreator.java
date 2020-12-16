package com.epam.oop.treasury.creator;

import com.epam.oop.treasury.beans.StandardTreasure;
import com.epam.oop.treasury.beans.Treasure;

import java.math.BigDecimal;

public class StandardTreasureCreator implements Creator {

    @Override
    public Treasure createTreasure(String name, BigDecimal price) {
        return new StandardTreasure(name, price);
    }
}
