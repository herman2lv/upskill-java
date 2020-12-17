package com.epam.strings.builders;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {
        System.out.print("Please, enter the string: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();
        System.out.printf("The entered string is:%n\"%s\"%n", string);
        Pattern pattern = Pattern.compile("\\d*-?\\w+-?\\w*");
        Matcher matcher = pattern.matcher(string);
        int maxLength = 0;
        String longestWord = "";
        while (matcher.find()) {
            int length = matcher.end() - matcher.start();
            if (length > maxLength) {
                maxLength = length;
                longestWord = matcher.group();
            }
        }
        System.out.printf("The longest word is \"%s\" and it contains %d characters", longestWord, maxLength);
    }
}