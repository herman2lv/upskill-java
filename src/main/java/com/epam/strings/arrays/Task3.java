package com.epam.strings.arrays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String string = "The person has been ruling for 26 years and 80.1 percent of 10 million-country is happy!(?)";
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(string);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.printf("The string:%n\"%s\"%ncontains %d digits", string, count);
    }
}
