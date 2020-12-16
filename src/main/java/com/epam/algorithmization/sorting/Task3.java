package com.epam.algorithmization.sorting;

import java.util.Arrays;

public class Task3 {
    public static void main (String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] array = arrayService.generateArray();
        System.out.println("\tBubble sort");
        System.out.printf("Initial array: %s", Arrays.toString(array));
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    isSorted = false;
                }
            }
        }
        System.out.printf("\nSorted array: %s", Arrays.toString(array));
    }
}