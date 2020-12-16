package com.epam.basics.cycles;

public class Task5 {
    public static void main (String[] args) {
        System.out.println("\n\t\t\t\tAmerican Standard Code for Information Interchange (ASCII)\n");
        char c = 33;
        for (int i = 33; i < 256; i++) {
            System.out.printf("%4d. %2c\t", i, c);
            c++;
            if (i % 8 == 0) {
                System.out.println();
            }
        }
    }
}
