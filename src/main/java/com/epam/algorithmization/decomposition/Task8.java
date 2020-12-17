package com.epam.algorithmization.decomposition;

import com.epam.algorithmization.sorting.ArrayService;

import java.util.Arrays;

import static com.epam.algorithmization.decomposition.Service.getSumOfSequentArraysElements;

public class Task8 {
    public static void main (String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] array = arrayService.generateArray();
        System.out.printf("The array is:%n%s", Arrays.toString(array));
        int lengthOfSequence = 3;
        int position1 = 1;
        int position2 = 3;
        int position3 = 4;
        String sumAnnouncement = "%nThe sum of array's elements with indexes from %d to %d is %d";
        System.out.printf(sumAnnouncement, position1, position1+lengthOfSequence-1,
                getSumOfSequentArraysElements(array, position1, lengthOfSequence));
        System.out.printf(sumAnnouncement, position2, position2+lengthOfSequence-1,
                getSumOfSequentArraysElements(array, position2, lengthOfSequence));
        System.out.printf(sumAnnouncement, position3, position3+lengthOfSequence-1,
                getSumOfSequentArraysElements(array, position3, lengthOfSequence));

    }
}