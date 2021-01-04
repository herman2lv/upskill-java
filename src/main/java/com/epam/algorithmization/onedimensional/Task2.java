package com.epam.algorithmization.onedimensional;

import com.epam.algorithmization.sorting.ArrayService;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        double[] array = arrayService.generateArrayOfDoubles();
        System.out.printf("Initial array%n%s", Arrays.toString(array));
        double z = 50.0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                counter++;
            }
        }
        System.out.printf("%nModified array%n%s%nArray's size: %d; number of replacements: %d",
                Arrays.toString(array), array.length, counter);
    }
}
