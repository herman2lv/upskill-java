package com.epam.algorithmization.matrix;

import com.epam.algorithmization.sorting.ArrayService;

import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        Random random = new Random();
        int numberOfColumns = random.nextInt(10) + 10;
        int numberOfRows = random.nextInt(10) + numberOfColumns;
        int[][] matrix = new int[numberOfRows][numberOfColumns];
        for (int j = 0; j < matrix[0].length; j++) {
            int counter = 0;
            while (counter < j + 1) {
                int i = random.nextInt(matrix.length);
                if (matrix[i][j] != 1) {
                    matrix[i][j] = 1;
                    counter++;
                }
            }
        }
        ArrayService arrayService = new ArrayService();
        arrayService.printMatrix(matrix);
    }
}
