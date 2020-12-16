package com.epam.algorithmization.decompositionUsingMethods;

import com.epam.algorithmization.sorting.ArrayService;

public class Task2 {
    public static void main (String[] args) {
        ArrayService arrayService = new ArrayService();
        int a = arrayService.getIntFomConsolePositive();
        int b = arrayService.getIntFomConsolePositive();
        int c = arrayService.getIntFomConsolePositive();
        int d = arrayService.getIntFomConsolePositive();
        int gcd =  Service.getGreatestCommonDivisorForManyNums(a, b, c, d);
        System.out.printf("For numbers %d, %d, %d and %d the greatest common divisor is %d",
                a, b, c, d, gcd);
    }
}