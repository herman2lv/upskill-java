package com.epam.basics.branching;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(1000);
        int b = random.nextInt(1000);
        int c = random.nextInt(1000);
        int d = random.nextInt(1000);
        System.out.printf("a = %d, b = %d, c = %d, d = %d%n", a, b, c, d);
        int min1;
        if (a <= b) {
            min1 = a;
        } else {
            min1 = b;
        }
        int min2;
        if (c <= d) {
            min2 = c;
        } else {
            min2 = d;
        }
        int max;
        if (min1 >= min2) {
            max = min1;
        } else {
            max = min2;
        }
        System.out.printf("max{min(a, b), min(c, d)} = %d", max);
    }
}
