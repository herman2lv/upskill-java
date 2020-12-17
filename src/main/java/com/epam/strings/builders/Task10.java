package com.epam.strings.builders;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {
    public static void main(String[] args) {
        String string = "Nobody will escape the punishment! I'll guarantee it. Don't you think so?";
        Pattern pattern = Pattern.compile(".[.?!]+");
        Matcher matcher = pattern.matcher(string);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.printf("The string:%n\"%s\"%ncontains %d sentences", string, count);
    }
}