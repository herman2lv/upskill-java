package com.epam.oop.treasury.service;

import com.epam.oop.treasury.beans.Treasure;
import com.epam.oop.treasury.dao.TreasuryDAOI;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TreasureService {
    private final TreasuryDAOI treasuryDAO;

    public TreasureService(TreasuryDAOI treasuryDAO) {
        this.treasuryDAO = treasuryDAO;
    }

    public List<Treasure> sortById() {
        List<Treasure> treasures = treasuryDAO.getTreasures();
        treasures.sort(Comparator.comparingInt(Treasure::getTreasureId));
        return treasures;
    }

    public List<Treasure> sortByPrice() {
        List<Treasure> treasures = treasuryDAO.getTreasures();
        treasures.sort(Comparator.comparing(Treasure::getPrice));
        return treasures;
    }

    public List<Treasure> sortByName() {
        List<Treasure> treasures = treasuryDAO.getTreasures();
        treasures.sort(Comparator.comparing(Treasure::getName));
        return treasures;
    }


    public Optional<Treasure> getMostExpensive() {
        return treasuryDAO.getTreasures().stream().max(Comparator.comparing(Treasure::getPrice));
    }

    public List<Treasure> getOnCertainSum(double sum) {
        List<Treasure> sorted = new ArrayList<>(treasuryDAO.getTreasures());
        List<Treasure> selectedTreasures = new ArrayList<>();
        sorted.sort(Comparator.comparing(Treasure::getPrice));
        BigDecimal totalCost = new BigDecimal(0);
        int i = 0;
        while ((totalCost.compareTo(BigDecimal.valueOf(sum)) < 0) && i < sorted.size()) {
            selectedTreasures.add(sorted.get(i));
            totalCost = totalCost.add(sorted.get(i).getPrice());
            i++;
        }
        return selectedTreasures;
    }

    public BigDecimal getTotalCost() {
        BigDecimal totalCost = new BigDecimal(0);
        for (Treasure treasure : treasuryDAO.getTreasures()) {
            totalCost = totalCost.add(treasure.getPrice());
        }
        return totalCost;
    }

    public BigDecimal getTotalCost(List<Treasure> treasures) {
        BigDecimal totalCost = new BigDecimal(0);
        for (Treasure treasure : treasures) {
            totalCost = totalCost.add(treasure.getPrice());
        }
        return totalCost;
    }

}
