package com.epam.algorithmization.oneaimensional;

import com.epam.algorithmization.sorting.ArrayService;

import java.util.Arrays;

public class Task6 {
    public static void main (String[] args) {
        ArrayService arrayService = new ArrayService();
        double[] array = arrayService.generateArrayOfDoubles();
        System.out.printf("Array%n%s%n", Arrays.toString(array));
        double sum = 0;
        for (int i = 1; i < array.length; i++) {
            boolean isComposite = false;
            for (int j = 2; j < (i+1)/2; j++) {
                if ((i + 1) % j == 0) {
                    isComposite = true;
                    break;
                }
            }
            if (!isComposite) {
                sum += array[i];
            }
        }
        System.out.printf("The sum of all elements of the array whose serial numbers are prime numbers is %.10f", sum);
    }
}