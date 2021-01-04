package com.epam.algorithmization.onedimensional;

import com.epam.algorithmization.sorting.ArrayService;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] array = arrayService.generateArray();
        System.out.printf("Array%n%s%n%n", Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i + 1) {
                System.out.printf("%d\t", array[i]);
            }
        }

    }
}
