package com.epam.algorithmization.sorting;

import java.util.Arrays;

public class Task1 {
    public static void main (String[] args) {
        int[] array1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int k = 3;
        int[] resultArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, resultArray, 0, k + 1);
        System.arraycopy(array2, 0, resultArray, k + 1, array2.length);
        System.arraycopy(array1, k + 1, resultArray, k + 1 + array2.length, array1.length - (k + 1));
        System.out.println(Arrays.toString(resultArray));
    }
}