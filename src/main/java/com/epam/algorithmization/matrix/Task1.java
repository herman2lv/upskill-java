package com.epam.algorithmization.matrix;

import com.epam.algorithmization.sorting.ArrayService;

public class Task1 {

    public static void main (String[] args) {
        ArrayService arrayService = new ArrayService();
        int[][] matrix = arrayService.generateMatrix();
        System.out.println("\n\tInitial matrix:\n");
        arrayService.printMatrix(matrix);
        System.out.println("\n\tSelected columns only:\n");
        for (int[] ints : matrix) {
            for (int j = 0; j < ints.length; j++) {
                if (matrix[0][j] > matrix[matrix.length - 1][j] && j % 2 == 0) {
                    System.out.printf("%5d", ints[j]);
                }
            }
            System.out.println();
        }


    }
}
