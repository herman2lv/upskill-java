package com.epam.basics.cycles;

public class Task6 {
    public static void main (String[] args) {
        NumberService numberService = new NumberService();
        System.out.print("Please, set up a left limit of the set");
        int leftLimit;
        do {
            leftLimit = numberService.getIntFomConsole();
            if (leftLimit <= 0) {
                System.out.println("Please, use only natural numbers (e.g. 1, 2, 3, ... etc.)");
            }
        } while (leftLimit <= 0);
        System.out.print("Please, set up a left limit of the set");
        int rightLimit;
        do {
            rightLimit = numberService.getIntFomConsole();
            if (rightLimit < leftLimit) {
                System.out.println("Right limit couldn't be less than the left limit");
                System.out.printf("(left limit was set up as %d)\nPlease, try again", leftLimit);
            }
        } while (rightLimit < leftLimit);
        for (int number = leftLimit; number <= rightLimit; number++) {
            boolean thereIsDividors = false;
            System.out.printf("\nNatural divisor(s) of a number %d:\t", number);
            for (int i = 2; i < number; i ++) {
                if (number % i == 0) {
                    System.out.printf("%d\t", i);
                    thereIsDividors = true;
                }
            }
            if (!thereIsDividors) {
                System.out.print("there is no any");
            }
        }
    }
}
