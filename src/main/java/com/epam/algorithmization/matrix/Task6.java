package com.epam.algorithmization.matrix;

import com.epam.algorithmization.sorting.ArrayService;

public class Task6 {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int n = arrayService.getIntFomConsolePositiveEven("size of matrix");
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                if (j >= i) {
                    matrix[i][j] = 1;
                    matrix[i][n - 1 - j] = 1;
                    matrix[n - 1 - i][j] = 1;
                    matrix[n - 1 - i][n - 1 - j] = 1;
                }
            }
        }
        arrayService.printMatrix(matrix);
    }
}
