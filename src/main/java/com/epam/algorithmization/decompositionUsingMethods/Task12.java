package com.epam.algorithmization.decompositionUsingMethods;

import java.util.Arrays;

public class Task12 {
    public static void main (String[] args) {
        int k = 21;
        int n = 3000;
        int[] array = Service.generateArrayWithCertainNumbers(100, k, n);
        if (array[0] != 0) {
            System.out.printf("Next array contains only numbers less than or equal to %d and " +
                            "have sum of digits equals to %d\n%s",
                    n, k, Arrays.toString(array));
        } else {
            System.out.printf("There is no any number less than or equals to %d and " +
                            "that has sum of digits equals to %d\n",
                    n, k);
        }


    }
}