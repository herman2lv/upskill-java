package com.epam.basics.cycles;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberService {
    public int getIntFomConsole() {
        System.out.print("\nPlease, enter a value: ");
        int number;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Couldn't read entered data. Please, try again");
            }
        }
        return number;
    }
    public BigDecimal getBigDecimalFomConsole() {
        System.out.print("\nPlease, enter a value: ");
        BigDecimal number;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextBigDecimal();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Couldn't read entered data. Please, try again");
            }
        }
        return number;
    }
    public int[] countDigits(int number) {
        int[] digitsCounter = new int[10];
        while (number != 0) {
            int digit = number % 10;
            digitsCounter[digit]++;
            number /= 10;
        }
        return digitsCounter;
    }
}
