package com.epam.algorithmization.decomposition;

import java.util.Arrays;

public class Task15 {
    public static void main(String[] args) {
        int n = 5;
        System.out.printf("The next %d-sign numbers has digits in ascending order:%n", n);
        int[] numbersWithAscendingDigits = Service.getNumbersWithAscendingDigits(n);
        System.out.println(Arrays.toString(numbersWithAscendingDigits));
    }
}
