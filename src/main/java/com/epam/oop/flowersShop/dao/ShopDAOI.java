package com.epam.oop.flowersShop.dao;

import com.epam.oop.flowersShop.beans.Flower;
import com.epam.oop.flowersShop.beans.Wrapping;

import java.util.List;

public interface ShopDAOI {
    List<Flower> getFlowers();

    List<Wrapping> getWrappings();
}
