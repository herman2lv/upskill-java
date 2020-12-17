package com.epam.algorithmization.sorting;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] array = arrayService.generateArray();
        System.out.println("\tInsertion sort");
        System.out.printf("Initial array: %s", Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > element) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = element;
        }
        System.out.printf("%nSorted array: %s", Arrays.toString(array));
    }
}
