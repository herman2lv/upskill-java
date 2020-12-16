package com.epam.algorithmization.sorting;

import java.util.Arrays;

public class Task5 {
    public static void main (String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] array = arrayService.generateArray();
        System.out.println("\tShell sort");
        System.out.printf("Initial array: %s", Arrays.toString(array));
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                for (int j = i - gap; j >= 0 && array[j] > array[j + gap] ; j -= gap) {
                    int temp = array[j];
                    array[j] = array[j + gap];
                    array[j + gap] = temp;
                }
            }
        }
        System.out.printf("\nSorted array: %s", Arrays.toString(array));
    }
}