package com.epam.fundamentals;

import java.util.Scanner;

public class MainTask5 {
    public static void main (String [] args) {
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
            System.out.println("Entered data couldn't be read" +
                    "\nPlease use integer numbers from 1 to 12");
            System.exit(1);
        }
        String monthName;
        switch (number) {
            case 1 -> monthName = "January";
            case 2 -> monthName = "February";
            case 3 -> monthName = "March";
            case 4 -> monthName = "April";
            case 5 -> monthName = "May";
            case 6 -> monthName = "June";
            case 7 -> monthName = "July";
            case 8 -> monthName = "August";
            case 9 -> monthName = "September";
            case 10 -> monthName = "October";
            case 11 -> monthName = "November";
            case 12 -> monthName = "December";
            default -> monthName = "There is no any matches." +
                    "\nPlease use integer numbers from 1 to 12";
        }
        System.out.println(monthName);
    }
}
