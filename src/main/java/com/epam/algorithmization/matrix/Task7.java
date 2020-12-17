package com.epam.algorithmization.matrix;

import com.epam.algorithmization.sorting.ArrayService;

public class Task7 {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int n = arrayService.getIntFomConsolePositiveEven("size of matrix");
        double[][] matrix = new double[n][n];
        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double temp = Math.pow((i + 1), 2) - Math.pow((j + 1), 2);
                matrix[i][j] = Math.sin(temp / n);
                if (matrix[i][j] > 0) {
                    counter++;
                }
            }
        }
        arrayService.printMatrix(matrix);
        System.out.printf("There are %d positive elements in the matrix", counter);
    }
}
