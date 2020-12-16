package com.epam.algorithmization.decompositionUsingMethods;

import com.epam.algorithmization.sorting.ArrayService;

public class Task6 {
    public static void main (String[] args) {
        ArrayService arrayService = new ArrayService();
        int a = arrayService.getIntFomConsolePositive();
        int b = arrayService.getIntFomConsolePositive();
        int c = arrayService.getIntFomConsolePositive();
        if (Service.areCoprime(a, b, c)) {
            System.out.printf("The numbers %d, %d and %d are coprime", a, b, c);
        } else {
            System.out.printf("The numbers %d, %d and %d are NOT coprime", a, b, c);
        }
    }
}