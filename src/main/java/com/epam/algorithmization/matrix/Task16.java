package com.epam.algorithmization.matrix;

import com.epam.algorithmization.sorting.ArrayService;

public class Task16 {
    public static void main (String[] args) {
        int size;
        ArrayService arrayService = new ArrayService();
        do {
            System.out.print("\nPlease, enter a size of the Magic square");
            size = arrayService.getIntFomConsole();
            if (size %2 == 0 || size <= 0) {
                System.out.print("The value should be positive and odd");
            }
        } while (size %2 == 0 || size <= 0);
        int[][] matrix = new int[size][size];
        int i = size/2;
        int j = size-1;
        for (int value = 1; value <= Math.pow(size, 2);) {
            if (i == -1 && j == size) {
                j = size - 2;
                i = 0;
            } else {
                if (j == size) {
                    j = 0;
                }
                if (i < 0) {
                    i = size - 1;
                }
            }
            if (matrix[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            } else {
                matrix[i][j] = value++;
            }
            j++;
            i--;
        }
        System.out.printf("%n\tMagic square (with side of %d):%n%n", size);
        arrayService.printMatrix(matrix);
    }
}
