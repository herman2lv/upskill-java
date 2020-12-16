package com.epam.algorithmization.sorting;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class ArrayComparingTest {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        int[] copiedArray = Arrays.copyOf(array, array.length);
        long time = new Date().getTime();
        Arrays.sort(copiedArray);
        time = new Date().getTime() - time;
        System.out.printf("Java API sort time is: %d%n", time);
        time = new Date().getTime();
        Arrays.sort(copiedArray);
        time = new Date().getTime() - time;
        System.out.printf("Java API sort time is: %d%n", time);
        System.out.println();

        copiedArray = Arrays.copyOf(array, array.length);
        shellSort(copiedArray);
        shellSort(copiedArray);
        System.out.println();

        copiedArray = Arrays.copyOf(array, array.length);
        shellSortM(copiedArray);
        shellSortM(copiedArray);
        System.out.println();

        copiedArray = Arrays.copyOf(array, array.length);
        insertionSort(copiedArray);
        insertionSort(copiedArray);
        System.out.println();

        copiedArray = Arrays.copyOf(array, array.length);
        insertionSortMod(copiedArray);
        insertionSortMod(copiedArray);
        System.out.println();

        copiedArray = Arrays.copyOf(array, array.length);
        selectionSort(copiedArray);
        selectionSort(copiedArray);
        System.out.println();

        copiedArray = Arrays.copyOf(array, array.length);
        bubbleSort(copiedArray);
        bubbleSort(copiedArray);
        System.out.println();

    }

    static void selectionSort(int[] array) {
        long time = new Date().getTime();
        for (int i = 0; i < array.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minElementIndex]) {
                    minElementIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minElementIndex];
            array[minElementIndex] = temp;
        }
        time = new Date().getTime() - time;
        System.out.printf("Selection sort time is: %d%n", time);
    }

    static void insertionSort(int[] array) {
        long time = new Date().getTime();
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            int j = i - 1;
            while (j >= 0 && element < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = element;
        }
        time = new Date().getTime() - time;
        System.out.printf("Insertion sort time is: %d%n", time);
    }

    static void insertionSortMod(int[] array) {
        long time = new Date().getTime();
        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; j >= 0 && array[j + 1] < array[j]; j--) {
                int temp = array[j + 1];
                array[j + 1] = array[j];
                array[j] = temp;
            }
        }
        time = new Date().getTime() - time;
        System.out.printf("Insertion sort (mod) time is: %d%n", time);
    }

    static void shellSort(int[] array) {
        long time = new Date().getTime();
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                for (int j = i - gap; j >= 0 && array[j] > array[j + gap]; j -= gap) {
                    int temp = array[j];
                    array[j] = array[j + gap];
                    array[j + gap] = temp;
                }
            }
        }
        time = new Date().getTime() - time;
        System.out.printf("Shell's sort time is: %d%n", time);
    }

    public static void shellSortM(int[] array) {
        long time = new Date().getTime();
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int element = array[i];
                int j = i - gap;
                while (j >= 0 && element < array[j]) {
                    array[j + gap] = array[j];
                    j -= gap;
                }
                array[j + gap] = element;
            }
        }
        time = new Date().getTime() - time;
        System.out.printf("Shell sort (M) time for an array of %d size is %d%n", array.length, time);
    }

    static void bubbleSort(int[] array) {
        long time = new Date().getTime();
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
        time = new Date().getTime() - time;
        System.out.printf("Bubble sort time is: %d%n", time);
    }


}