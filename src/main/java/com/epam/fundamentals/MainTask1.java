package com.epam.fundamentals;

import java.util.Scanner;

public class MainTask1 {
    public static void main (String [] args) {
//Task is to greet any user after input of his name using command line
        System.out.print("Please, enter your name : ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        userName = userName.strip();
        if (userName.isBlank()) {
            System.out.println("Hello, friend!");
        } else {
            System.out.println("Hello, " + userName + "!");
        }
    }
}
