package com.epam.algorithmization.sorting;

import java.util.Arrays;
import java.util.Date;

public class BinarySearcher {
    public static void main(String[] args) {
        int size = 1_052_509_990;

        long time = new Date().getTime();
        int[] array = new int[size];
        time = new Date().getTime() - time;
        System.out.printf("Time to create new empty array: %d%n", time);

        time = new Date().getTime();
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        time = new Date().getTime() - time;
        System.out.printf("Time to fill array: %d%n", time);

        time = new Date().getTime();
        System.out.println(Arrays.binarySearch(array, 10000));
        time = new Date().getTime() - time;
        System.out.printf("Time for Java API binary search: %d%n", time);

        time = new Date().getTime();
        System.out.println(binarySearch(array, 1_052_509_989));
        time = new Date().getTime() - time;
        System.out.printf("Time for my binary search: %d%n", time);


    }

    public static int binarySearch(int[] array, int key) {
        int leftLimit = 0;
        int rightLimit = array.length - 1;
        while (leftLimit <= rightLimit) {
            int index = (leftLimit + rightLimit) / 2;
            if (key == array[index]) {
                return index;
            } else if (key < array[index]) {
                rightLimit = index - 1;
            } else if (key > array[index]) {
                leftLimit = index + 1;
            }
        }
        return -1;
    }
}
