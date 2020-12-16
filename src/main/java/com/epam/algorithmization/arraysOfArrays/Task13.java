package com.epam.algorithmization.arraysOfArrays;

import com.epam.algorithmization.sorting.ArrayService;

public class Task13 {
    public static void main (String[] args) {
        ArrayService arrayService = new ArrayService();
        int[][] matrix = arrayService.generateMatrix();
        System.out.println("\n\tInitial matrix:\n");
        arrayService.printMatrix(matrix);
        for (int col = 0; col < matrix[0].length; col++) {
            for (int gap = matrix.length/2; gap > 0; gap /= 2) {
                for (int i = gap; i < matrix.length; i++) {
                    for (int row = i - gap; row >= 0 && matrix[row][col] > matrix[row+gap][col]; row -= gap) {
                        int temp = matrix[row][col];
                        matrix[row][col] = matrix[row+gap][col];
                        matrix[row+gap][col] = temp;
                    }
                }
            }
        }
        System.out.println("\n\tMatrix after sorting of it's elements by columns:\n");
        arrayService.printMatrix(matrix);
    }
}