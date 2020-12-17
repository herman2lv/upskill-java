package com.epam.algorithmization.matrix;

import com.epam.algorithmization.sorting.ArrayService;

import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][20];
        int[] counterOf5 = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                Random random = new Random();
                matrix[i][j] = random.nextInt(16);
                if (matrix[i][j] == 5) {
                    counterOf5[i]++;
                    if (counterOf5[i] == 3) {
                        break;
                    }
                }
            }
        }
        System.out.println("\n\tInitial matrix:\n");
        ArrayService arrayService = new ArrayService();
        arrayService.printMatrix(matrix);
        System.out.print("\nNumber(s) of row(s) that contain(s) three or more digits '5':\n");
        boolean exists = false;
        for (int i = 0; i < counterOf5.length; i++) {
            if (counterOf5[i] >= 3) {
                System.out.printf("%-5d", i + 1);
                exists = true;
            }
        }
        if (!exists) {
            System.out.println("there is no such rows");
        }
    }
}
