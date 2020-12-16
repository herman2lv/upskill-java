package com.epam.oop.treasury.dao;

import com.epam.oop.treasury.beans.Treasure;

import java.util.ArrayList;
import java.util.List;

public class TreasuryDAO implements TreasuryDAOI {
    private List<Treasure> treasures = new ArrayList<>();

    public TreasuryDAO() {
    }

    public List<Treasure> getTreasures() {
        return new ArrayList<>(treasures);
    }

    public void add(List<Treasure> treasures) {
        this.treasures = treasures;
    }
}
