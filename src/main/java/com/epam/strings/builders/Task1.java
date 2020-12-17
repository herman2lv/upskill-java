package com.epam.strings.builders;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        String string = "  Criminals   should            be in     prison   not    in   palace      ";
        System.out.printf("The string is:%n\"%s\"%n", string);
        Pattern pattern = Pattern.compile("\s+");
        Matcher matcher = pattern.matcher(string);
        int maxLength = 0;
        while (matcher.find()) {
            int length = matcher.end() - matcher.start();
            if (length > maxLength) {
                maxLength = length;
            }
        }
        System.out.printf("The max number of whitespace-characters in a row is %d", maxLength);
    }
}