package com.epam.algorithmization.matrix;

import com.epam.algorithmization.sorting.ArrayService;

public class Task4 {
    public static void main (String[] args) {
        ArrayService arrayService = new ArrayService();
        int n = arrayService.getIntFomConsolePositiveEven("size of matrix");
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = j + 1;
                } else {
                    matrix[i][j] = n - j;
                }
            }
        }
        arrayService.printMatrix(matrix);
    }
}