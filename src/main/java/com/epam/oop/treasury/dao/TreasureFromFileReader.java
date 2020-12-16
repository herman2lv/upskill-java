package com.epam.oop.treasury.dao;

import com.epam.oop.treasury.beans.Treasure;
import com.epam.oop.treasury.creator.Creator;
import com.epam.oop.treasury.creator.StandardTreasureCreator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TreasureFromFileReader {
    public static String FILE_PATH = "data/";
    public static String FILE_NAME = "treasures.txt";
    private final TreasuryDAOI treasuryDAO;

    public TreasureFromFileReader(TreasuryDAOI treasuryDAO) {
        this.treasuryDAO = treasuryDAO;
    }

    public boolean getTreasuresFromFile() {
        List<Treasure> treasury = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH + FILE_NAME))) {
            String[] allTreasures = bufferedReader.lines().toArray(String[]::new);
            Creator creator = new StandardTreasureCreator();
            for (String treasure : allTreasures) {
                String[] treasureFields = treasure.split(":");
                treasury.add(creator.createTreasure(treasureFields[0], BigDecimal.valueOf(Double.parseDouble(treasureFields[1]))));
            }
            treasuryDAO.add(treasury);
        } catch (IOException e) {
            System.out.println("File wasn't found");
            return false;
        }
        return true;
    }
}
