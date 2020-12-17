package com.epam.strings.builders;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String string = "We must be decisive in that difficult time. Are you with us?";
        Pattern pattern = Pattern.compile("[Aa]");
        Matcher matcher = pattern.matcher(string);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.printf("The string:%n\"%s\"%ncontains %d letters \"a\"", string, count);
    }
}