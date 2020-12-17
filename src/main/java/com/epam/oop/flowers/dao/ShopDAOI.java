package com.epam.oop.flowers.dao;

import com.epam.oop.flowers.beans.Flower;
import com.epam.oop.flowers.beans.Wrapping;

import java.util.List;

public interface ShopDAOI {
    List<Flower> getFlowers();

    List<Wrapping> getWrappings();
}
