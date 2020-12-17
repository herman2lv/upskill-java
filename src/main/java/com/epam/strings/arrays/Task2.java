package com.epam.strings.arrays;

public class Task2 {
    public static void main(String[] args) {
        String string = "Word or not worD? Maybe better to right WORD? Still don't know. Word or not a word?";
        System.out.printf("The initial string is:%n\"%s\"%n", string);
        string = string.replaceAll("[wW][oO][rR][dD]", "letter");
        System.out.printf("The modified string is:%n\"%s\"%n", string);
    }
}
