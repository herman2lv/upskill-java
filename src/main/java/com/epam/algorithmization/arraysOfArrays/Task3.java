package com.epam.algorithmization.arraysOfArrays;

import com.epam.algorithmization.sorting.ArrayService;

public class Task3 {
    public static void main (String[] args) {
        ArrayService arrayService = new ArrayService();
        int[][] matrix = arrayService.generateMatrix();
        System.out.println("\n\tInitial matrix:\n");
        arrayService.printMatrix(matrix);
        int k = 4;
        int p = 3;
        System.out.printf("\n\tSelected elements only (chosen row#: %d; chosen column#: %d)\n", k, p);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == k || j == p) {
                    System.out.printf("%5d", matrix[i][j]);
                } else {
                    System.out.printf("%5s", "");
                }
            }
            System.out.println();
        }

    }
}
