package com.epam.algorithmization.onedimensional;

import com.epam.algorithmization.sorting.ArrayService;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] array = arrayService.generateArray();
        System.out.printf("Array%n%s%n", Arrays.toString(array));
        int maxFrequency = 0;
        int mostFrequentNumberIndex = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int frequency = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    frequency++;
                }
            }
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentNumberIndex = i;
            } else if (frequency == maxFrequency && array[i] < array[mostFrequentNumberIndex]) {
                mostFrequentNumberIndex = i;
            }
        }
        System.out.printf("Most frequent number is %d (this number occurs in the array %d time(s))",
                array[mostFrequentNumberIndex], maxFrequency);


    }
}
