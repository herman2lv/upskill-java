package com.epam.algorithmization.arraysOfArrays;

import com.epam.algorithmization.sorting.ArrayService;

public class Task5 {
    public static void main (String[] args) {
        ArrayService arrayService = new ArrayService();
        int n = arrayService.getIntFomConsolePositiveEven("size of matrix");
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                matrix[i][j] = i+1;
            }
        }
        arrayService.printMatrix(matrix);
    }
}