package com.epam.fundamentals;

public class MainTask4 {
    public static void main(String[] args) {
        //Enter integers as command line arguments,
        // calculate their sum and print the result to the console
        if (args.length == 0) {
            System.out.println("There is no any command line argument");
            System.exit(1);
        }
        int sum = 0;
        for (String arg : args) {
            int element;
            try {
                element = Integer.parseInt(arg);
            } catch (IllegalArgumentException e) {
                element = 0;
            }
            sum += element;
        }
        System.out.println("Sum of numbers among command line arguments is: " + sum);
    }
}
