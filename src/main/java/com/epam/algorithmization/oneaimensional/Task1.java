package com.epam.algorithmization.oneaimensional;

import com.epam.algorithmization.sorting.ArrayService;

import java.util.Arrays;

public class Task1 {
    public static void main (String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] array = arrayService.generateArray();
        System.out.println(Arrays.toString(array));
        int k = 3;
        int sum = 0;
        for (int element: array) {
            if (element % k == 0) {
                sum += element;
            }
        }
        System.out.printf("The sum of all elements of the array that are multiples of %d is %d", k, sum);
    }
}
