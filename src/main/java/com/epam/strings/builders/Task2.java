package com.epam.strings.builders;

public class Task2 {
    public static void main(String[] args) {
        String string = "Criminals should be in prison not in palace";
        System.out.printf("The initial string is:%n\"%s\"%n", string);
        string = string.replace("a", "ab");
        System.out.printf("The modified string is:%n\"%s\"%n", string);
    }
}
