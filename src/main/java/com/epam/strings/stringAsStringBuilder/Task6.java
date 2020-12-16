package com.epam.strings.stringAsStringBuilder;

public class Task6 {
    public static void main(String[] args) {
        String string = "The man who executes criminal orders is also a criminal!";
        System.out.printf("The initial string is:\n\"%s\"\n", string);
        string = string.replaceAll("(.)", "$1$1");
        System.out.printf("The modified string is:\n\"%s\"\n", string);
    }
}