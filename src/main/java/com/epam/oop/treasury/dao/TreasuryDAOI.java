package com.epam.oop.treasury.dao;

import com.epam.oop.treasury.beans.Treasure;

import java.util.List;

public interface TreasuryDAOI {
    List<Treasure> getTreasures();

    void add(List<Treasure> treasures);
}
