package com.epam.algorithmization.decomposition;

import java.util.Arrays;

import static com.epam.algorithmization.decomposition.Service.getArrayFromDigitsOfNumber;

public class Task10 {
    public static void main (String[] args) {
        int number = 1654999419;
        System.out.printf("The number is %d%n", number);
        System.out.printf("%nThe array containing the digits of the number is%n%s",
                Arrays.toString(getArrayFromDigitsOfNumber(number)));
    }
}