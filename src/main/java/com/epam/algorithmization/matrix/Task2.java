package com.epam.algorithmization.matrix;

import com.epam.algorithmization.sorting.ArrayService;

public class Task2 {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int[][] matrix = arrayService.generateSquareMatrix();
        System.out.println("\n\tInitial matrix:\n");
        arrayService.printMatrix(matrix);
        System.out.println("\n\tSelected elements only:\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j == i) {
                    System.out.printf("%5d", matrix[i][j]);
                } else if (j == matrix.length - 1 - i) {
                    System.out.printf("%5d", matrix[i][j]);
                } else {
                    System.out.printf("%5s", "");
                }
            }
            System.out.println();
        }
    }
}
