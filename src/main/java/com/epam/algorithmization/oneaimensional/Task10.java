package com.epam.algorithmization.oneaimensional;

import com.epam.algorithmization.sorting.ArrayService;

import java.util.Arrays;

public class Task10 {
    public static void main (String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] array = arrayService.generateArray();
        System.out.printf("Initial array%n%s%n", Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
        }
        System.out.printf("Modified array%n%s%n", Arrays.toString(array));
    }
}