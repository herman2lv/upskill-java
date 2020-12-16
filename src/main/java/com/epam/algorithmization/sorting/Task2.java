package com.epam.algorithmization.sorting;

import java.util.Arrays;

public class Task2 {
    public static void main (String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] array = arrayService.generateArray();
        System.out.println("\tSelection sort");
        System.out.printf("Initial array: %s", Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            int minElement = array[i];
            int minElementIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (minElement > array[j]) {
                    minElement = array[j];
                    minElementIndex = j;
                }
            }
            int temp = array[i];
            array[i] = minElement;
            array[minElementIndex] = temp;
        }
        System.out.printf("\nSorted array: %s", Arrays.toString(array));
    }
}