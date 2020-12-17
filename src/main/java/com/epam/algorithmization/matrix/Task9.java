package com.epam.algorithmization.matrix;

import com.epam.algorithmization.sorting.ArrayService;

public class Task9 {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int[][] matrix = arrayService.generatePositiveMatrix();
        System.out.println("\n\tInitial matrix:\n");
        arrayService.printMatrix(matrix);
        int maxSum = 0;
        int maxColNumber = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            int sum = 0;
            for (int[] values : matrix) {
                sum += values[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxColNumber = j;
            }
        }
        System.out.printf("%nThe sum of the elements of the column#%d is maximal and equals to %d",
                maxColNumber, maxSum);
    }
}
