package com.epam.algorithmization.decomposition;

import java.util.Arrays;

import static com.epam.algorithmization.decomposition.Service.getArmstrongNumbers;

public class Task14 {
    public static void main (String[] args) {
        int k = 100000;
        System.out.printf("The next numbers from 1 to %d are Armstrong numbers:%n", k);
        System.out.println(Arrays.toString(getArmstrongNumbers(1, k)));
    }
}