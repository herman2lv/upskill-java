package com.epam.oop.treasury.creator;

import com.epam.oop.treasury.beans.Treasure;

import java.math.BigDecimal;

public interface Creator {
    Treasure createTreasure(String name, BigDecimal price);
}
