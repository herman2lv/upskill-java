package com.epam.oop.treasury.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class TreasuresGenerator {
    private final static int NUMBER_OF_TREASURES = 100;
    private final static int MAX_COST = 1000;
    private final static int FRACTION_DIGITS_OF_DOLLAR = 2;

    public static void generate() {
        final File file = new File(TreasureFromFileReader.FILE_PATH);
        file.mkdirs();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(TreasureFromFileReader.FILE_PATH + TreasureFromFileReader.FILE_NAME))) {
            Random random = new Random();
            for (int i = 1; i <= NUMBER_OF_TREASURES; i++) {
                int integerPartOfCost = random.nextInt(MAX_COST);
                BigDecimal fractionalPartOfCost = BigDecimal.valueOf(random.nextDouble())
                        .setScale(FRACTION_DIGITS_OF_DOLLAR, RoundingMode.HALF_UP);
                BigDecimal cost = fractionalPartOfCost.add(BigDecimal.valueOf(integerPartOfCost));
                String treasure = "Dragon's treasure#" + i + ":" + cost;
                bufferedWriter.write(treasure);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
