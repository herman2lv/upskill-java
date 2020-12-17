package com.epam.fundamentals;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainTask3 {
    private static final int DEFAULT_NUMBER_VALUE = 10;
    public static void main(String[] args) {
        // Print a given number of random numbers with and without a new line
        System.out.print("Please, enter a required number of random numbers: ");
        Scanner scanner = new Scanner(System.in);
        String numberString = scanner.nextLine();
        numberString = numberString.strip();
        int number;
        try {
            number = Integer.parseInt(numberString);
        } catch (IllegalArgumentException e) {
            number = DEFAULT_NUMBER_VALUE;
            System.out.println("Entered data couldn't be read."
                    + "\nRequired number was set as default value: " + number);
        }
        if (number > 100) {
            number = 100;
            System.out.println("Entered number is too large."
                    + "\nRequired number was set as maximal acceptable value: " + number);
        }
        Random random = new Random();
        int[] listOfRandomNumbers = new int[number];
        for (int i = 0; i < listOfRandomNumbers.length; i++) {
            listOfRandomNumbers[i] = random.nextInt(1000);
        }
        System.out.println("Generated random numbers: " + Arrays.toString(listOfRandomNumbers));
    }
}
