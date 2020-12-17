package com.epam.algorithmization.oneaimensional;

import com.epam.algorithmization.sorting.ArrayService;

import java.util.Arrays;

public class Task3 {
    public static void main (String[] args) {
        ArrayService arrayService = new ArrayService();
        double[] array = arrayService.generateArrayOfDoubles();
        System.out.printf("Array%n%s", Arrays.toString(array));
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (double element : array) {
            if (element > 0) {
                positive++;
            } else if (element < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.printf("%nNumber of array's elements%n\tpositive:\t\t%d%n\tnegative:\t\t%d%n\tequal to zero:\t%d",
                positive, negative, zero);
    }
}