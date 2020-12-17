package com.epam.basics.cycles;

public class Task1 {
    public static void main(String[] args) {
        NumberService numberService = new NumberService();
        int number;
        do {
            number = numberService.getIntFomConsole();
            if (number <= 0) {
                System.out.println("Please, use only positive integer numbers (e.g. 1, 2, 3, ... etc.)");
            }
        } while (number <= 0);
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.printf("Sum of all natural numbers from 1 to %d is %d", number, sum);
    }
}
