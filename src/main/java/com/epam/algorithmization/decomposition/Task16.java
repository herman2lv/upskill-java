package com.epam.algorithmization.decomposition;

import static com.epam.algorithmization.decomposition.Service.getNumberOfEvenDigits;
import static com.epam.algorithmization.decomposition.Service.getSumOfNumbersWithOddDigits;

public class Task16 {
    public static void main (String[] args) {
        int n = 6;
        int sum = getSumOfNumbersWithOddDigits(n);
        System.out.printf("The sum of all %d-sign numbers containing only odd digits is %d%n", n, sum);
        int numberOfEvenDigits = getNumberOfEvenDigits(sum);
        System.out.printf("The number of even digits in the sum is %d", numberOfEvenDigits);
    }
}