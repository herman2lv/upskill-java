package com.epam.algorithmization.decomposition;

import com.epam.algorithmization.sorting.ArrayService;

import static com.epam.algorithmization.decomposition.Service.getGreatestCommonDivisor;
import static com.epam.algorithmization.decomposition.Service.getLeastCommonMultiple;

public class Task1 {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int a = arrayService.getIntFomConsolePositive();
        int b  = arrayService.getIntFomConsolePositive();
        int gcd = getGreatestCommonDivisor(a, b);
        int lcm = getLeastCommonMultiple(a, b);
        System.out.printf("For numbers %d and %d the greatest common divisor is %d, the least common multiple is %d",
                a, b, gcd, lcm);
    }
}
