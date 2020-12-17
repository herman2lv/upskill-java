package com.epam.algorithmization.oneaimensional;

import com.epam.algorithmization.sorting.ArrayService;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        double[] array = arrayService.generateArrayOfDoubles();
        System.out.printf("Initial array%n%s", Arrays.toString(array));
        int min = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
            if (array[i] < array[min]) {
                min = i;
            }
        }
        System.out.printf("%nMax element of the array:\t%f\t(it's position:\t%d)", array[max], max + 1);
        System.out.printf("%nMin element of the array:\t%f\t(it's position:\t%d)", array[min], min + 1);
        double temp = array[min];
        array[min] = array[max];
        array[max] = temp;
        System.out.printf("%nArray after replacement of min and max elements%n%s", Arrays.toString(array));
    }
}
