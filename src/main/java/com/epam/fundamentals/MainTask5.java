package com.epam.fundamentals;

import java.util.Scanner;

public class MainTask5 {
    public static void main(String[] args) {
        //Enter a number from 1 to 12.
        // Output to the console the name of the month corresponding to the given date.
        // Check the correctness of entering numbers.
        System.out.print("Please, enter a number of month (use numbers from 1 to 12): ");
        Scanner scanner = new Scanner(System.in);
        String numberString = scanner.nextLine();
        numberString = numberString.strip();
        int number = 0;
        try {
            number = Integer.parseInt(numberString);
        } catch (IllegalArgumentException e) {
            System.out.println("Entered data couldn't be read"
                    + "\nPlease use integer numbers from 1 to 12");
            System.exit(1);
        }
        String monthName = switch (number) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "There is no any matches."
                    + "\nPlease use integer numbers from 1 to 12";
        };
        System.out.println(monthName);
    }
}
