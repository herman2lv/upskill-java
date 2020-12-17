package com.epam.strings.builders;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.print("Please, enter the string: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();
        System.out.printf("The entered string is:%n\"%s\"%n", string);
        string = string.strip().replaceAll("\\s*", "");
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (resultString.toString().indexOf(string.charAt(i)) == -1) {
                resultString.append(string.charAt(i));
            }
        }
        System.out.printf("The modified string is:%n\"%s\"%n", resultString);
    }
}