package com.epam.algorithmization.onedimensional;

import com.epam.algorithmization.sorting.ArrayService;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] array = arrayService.generateArray();
        System.out.printf("Initial array%n%s%n", Arrays.toString(array));
        int min = array[0];
        int elementsToRemove = 0;
        for (int element: array) {
            if (element < min) {
                min = element;
                elementsToRemove = 1;
            } else if (element == min) {
                elementsToRemove++;
            }
        }
        int[] modifiedArray = new int[array.length - elementsToRemove];
        int index = 0;
        for (int element: array) {
            if (element > min) {
                modifiedArray[index] = element;
                index++;
            }
        }
        System.out.printf("Modified array (removed %d element(s) equal to %d)%n%s",
                elementsToRemove, min, Arrays.toString(modifiedArray));

    }
}
