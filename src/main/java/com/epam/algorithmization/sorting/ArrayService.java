package com.epam.algorithmization.sorting;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayService {
    Random random = new Random();
    final int DEFAULT_RANGE_OF_ARRAY_LENGTH = 100;
    final int DEFAULT_RANGE_OF_NUMBERS_VALUES = 200;
    final int DEFAULT_RANGE_OF_MATRIX_ARRAY_LENGTH = 20;
    final int DEFAULT_MIN_MATRIX_ARRAY_LENGTH = 10;
    final String FORMAT_PATTERN_FOR_INTS = "%5d";
    final String FORMAT_PATTERN_FOR_FLOATS = "%14.8f";

    public int[] generateArray () {
        int[] array = new int[random.nextInt(DEFAULT_RANGE_OF_ARRAY_LENGTH) + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(DEFAULT_RANGE_OF_NUMBERS_VALUES) - DEFAULT_RANGE_OF_NUMBERS_VALUES/2;
        }
        return array;
    }
    public double[] generateArrayOfDoubles () {
        double[] array = new double[random.nextInt(DEFAULT_RANGE_OF_ARRAY_LENGTH) + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble() * DEFAULT_RANGE_OF_NUMBERS_VALUES - DEFAULT_RANGE_OF_NUMBERS_VALUES/2.0;
        }
        return array;
    }
    public int[][] generateMatrix () {
        int[][] matrix = new int[random.nextInt(DEFAULT_RANGE_OF_MATRIX_ARRAY_LENGTH) + DEFAULT_MIN_MATRIX_ARRAY_LENGTH]
                [random.nextInt(DEFAULT_RANGE_OF_MATRIX_ARRAY_LENGTH) + DEFAULT_MIN_MATRIX_ARRAY_LENGTH];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(DEFAULT_RANGE_OF_NUMBERS_VALUES) - DEFAULT_RANGE_OF_NUMBERS_VALUES / 2;
            }
        }
        return matrix;
    }
    public int[][] generatePositiveMatrix () {
        int[][] matrix = new int[random.nextInt(DEFAULT_RANGE_OF_MATRIX_ARRAY_LENGTH) + DEFAULT_MIN_MATRIX_ARRAY_LENGTH]
                [random.nextInt(DEFAULT_RANGE_OF_MATRIX_ARRAY_LENGTH) + DEFAULT_MIN_MATRIX_ARRAY_LENGTH];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = random.nextInt(DEFAULT_RANGE_OF_NUMBERS_VALUES/2);
        }
        return matrix;
    }
    public int[][] generateSquareMatrix () {
        int matrixSize = random.nextInt(DEFAULT_RANGE_OF_MATRIX_ARRAY_LENGTH) + DEFAULT_MIN_MATRIX_ARRAY_LENGTH;
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++)
                matrix[i][j] = random.nextInt(DEFAULT_RANGE_OF_NUMBERS_VALUES) - DEFAULT_RANGE_OF_NUMBERS_VALUES/2;
        }
        return matrix;
    }
    public void printMatrix (int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.printf(FORMAT_PATTERN_FOR_INTS, anInt);
            }
            System.out.println();
        }
    }
    public void printMatrix (double[][] array) {
        for (double[] values : array) {
            for (double value : values) {
                System.out.printf(FORMAT_PATTERN_FOR_FLOATS, value);
            }
            System.out.println();
        }
    }
    public int getIntFomConsole () {
        System.out.print("\nPlease, enter a value: ");
        int number;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Couldn't read entered data. Please, try again");
                continue;
            }
            break;
        }
        return number;
    }
    public int getIntFomConsolePositive () {
        ArrayService arrayService = new ArrayService();
        int n;
        do {
            System.out.print("\nPlease, enter a positive integer number");
            n = arrayService.getIntFomConsole();
            if (n <= 0) {
                System.out.print("The number should be positive");
            }
        } while (n <= 0);
        return n;
    }
    public int getIntFomConsolePositiveEven (String additionalInfo) {
        ArrayService arrayService = new ArrayService();
        int n;
        do {
            System.out.print("Please, enter an even positive number (" + additionalInfo + ")");
            n = arrayService.getIntFomConsole();
            if (n <= 0) {
                System.out.println("The number should be positive");
            } else if (n % 2 != 0) {
                System.out.println("The number should be even");
            }
        } while (n <= 0 || n % 2 != 0);
        return n;
    }
}