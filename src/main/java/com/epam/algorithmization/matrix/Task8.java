package com.epam.algorithmization.matrix;

import com.epam.algorithmization.sorting.ArrayService;

public class Task8 {
    public static void main (String[] args) {
        ArrayService arrayService = new ArrayService();
        int[][] matrix = arrayService.generateMatrix();
        System.out.println("\n\tInitial matrix:\n");
        arrayService.printMatrix(matrix);
        System.out.printf("%nThe matrix has %d rows and %d columns", matrix.length, matrix[0].length);
        int column1;
        int column2;
        do {
            System.out.print("\nPlease, enter a number of first column that you would like to swap");
            column1 = arrayService.getIntFomConsole();
            if (column1 <= 0 || column1 > matrix[0].length) {
                System.out.print("There is no such column in the matrix");
            }
        } while (column1 <= 0 || column1 > matrix[0].length);
        do {
            System.out.print("\nPlease, enter a number of second column that you would like to swap");
            column2 = arrayService.getIntFomConsole();
            if (column2 <= 0 || column2 > matrix.length) {
                System.out.print("There is no such column in the matrix");
            } else if (column2 == column1) {
                System.out.print("The number of column shouldn't be equal to the number of the first column");
            }
        } while (column2 <= 0 || column2 > matrix.length || column2 == column1);
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][column1-1];
            matrix[i][column1-1] = matrix[i][column2-1];
            matrix[i][column2-1] = temp;
        }
        System.out.println("\n\tModified matrix:\n");
        arrayService.printMatrix(matrix);
    }
}
