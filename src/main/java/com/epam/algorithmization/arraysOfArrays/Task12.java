package com.epam.algorithmization.arraysOfArrays;

import com.epam.algorithmization.sorting.ArrayService;

import java.util.Arrays;

public class Task12 {
    public static void main (String[] args) {
        ArrayService arrayService = new ArrayService();
        int[][] matrix = arrayService.generateMatrix();
        System.out.println("\n\tInitial matrix:\n");
        arrayService.printMatrix(matrix);
        for (int[] elements : matrix) {
            Arrays.sort(elements);
        }
        System.out.println("\n\tMatrix after sorting of it's elements by rows:\n");
        arrayService.printMatrix(matrix);
    }
}