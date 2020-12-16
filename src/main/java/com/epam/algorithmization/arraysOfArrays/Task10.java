package com.epam.algorithmization.arraysOfArrays;

import com.epam.algorithmization.sorting.ArrayService;

public class Task10 {
    public static void main (String[] args) {
        ArrayService arrayService = new ArrayService();
        int[][] matrix = arrayService.generateSquareMatrix();
        System.out.println("\n\tInitial matrix:\n");
        arrayService.printMatrix(matrix);
        System.out.println("\nAll positive elements of the main diagonal of the matrix:");
        for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][i] > 0) {
                    System.out.printf("%-5d", matrix[i][i]);
            }
        }
    }
}