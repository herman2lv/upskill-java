package com.epam.algorithmization.decomposition;

import static com.epam.algorithmization.decomposition.Service.getSumOfOddFactorials;

public class Task7 {
    public static void main (String[] args) {
        int a = 9;
        System.out.printf("The sum of factorials of all odd integers from 1 to %d is %d", a, getSumOfOddFactorials(a));
    }
}