package com.epam.strings.builders;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public static void main(String[] args) {
        System.out.print("Please, enter the string: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();
        int countSmallLetters = getNumberOfCharacters("[a-z]", string);
        int countCapitalLetters = getNumberOfCharacters("[A-Z]", string);
        System.out.printf("The string:%n\"%s\"%ncontains %d small and %d capital letters",
                string, countSmallLetters, countCapitalLetters);
    }
    public static int getNumberOfCharacters(String regex, String string) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        int countCharacters = 0;
        while (matcher.find()) {
            countCharacters++;
        }
        return countCharacters;
    }
}
