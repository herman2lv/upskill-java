package com.epam.algorithmization.decompositionUsingMethods;

import com.epam.algorithmization.sorting.ArrayService;

import java.util.Arrays;

public class Task5 {
    public static void main (String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] array = arrayService.generateArray();
        System.out.printf("The array is:\n%s", Arrays.toString(array));
        System.out.printf("\nThe second greatest element of the array is %d", Service.getSecondGreatestElement(array));
    }
}