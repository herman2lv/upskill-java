package com.epam.algorithmization.decompositionUsingMethods;

import static com.epam.algorithmization.decompositionUsingMethods.Service.compareNumbersByNumberOfDigits;

public class Task11 {
    public static void main (String[] args) {
        int number1 = 542343;
        int number2 = 234234423;
        if (compareNumbersByNumberOfDigits(number1, number2) > 0) {
            System.out.printf("Number %d contains more digits than %d", number1, number2);
        } else if (compareNumbersByNumberOfDigits(number1, number2) < 0) {
            System.out.printf("Number %d contains more digits than %d", number2, number1);
        } else {
            System.out.printf("Number %d contains the same number of digits as %d", number1, number2);
        }
    }
}