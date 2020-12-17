package com.epam.basics.cycles;

public class Task7 {
    public static void main(String[] args) {
        NumberService numberService = new NumberService();
        int number1 = numberService.getIntFomConsole();
        System.out.println("Number is accepted");
        int number2 = numberService.getIntFomConsole();
        System.out.println("Number is accepted");
        int[] digitsOfNumber1 = numberService.countDigits(number1);
        int[] digitsOfNumber2 = numberService.countDigits(number2);
        System.out.printf("Numbers %d and %d both contain next number(s): ", number1, number2);
        boolean thereIsCommonNumbers = false;
        for (int i = 0; i < 10; i++) {
            if (digitsOfNumber1[i] > 0 && digitsOfNumber2[i] > 0) {
                System.out.printf("\t%d", i);
                thereIsCommonNumbers = true;
            }
        }
        if (!thereIsCommonNumbers) {
            System.out.println("\tthere is no any");
        }
    }
}
