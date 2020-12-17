package com.epam.algorithmization.decomposition;

import static com.epam.algorithmization.decomposition.Service.*;

public class Task13 {
    public static void main (String[] args) {
        int n = 100000;
        int[][] twins = getTwinPrimeNumbers(getPrimeNumbers(n, 2 * n));
        printTwinPrimeNumbers(twins);
    }
}