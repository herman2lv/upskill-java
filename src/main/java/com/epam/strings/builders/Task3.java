package com.epam.strings.builders;

public class Task3 {
    public static void main(String[] args) {
        String word = "Tenet";
        StringBuilder wordAsStrBuilder = new StringBuilder(word);
        String reversedWord = wordAsStrBuilder.reverse().toString();
        if (word.equalsIgnoreCase(reversedWord)) {
            System.out.printf("The word \"%s\" is a palindrome", word);
        } else {
            System.out.printf("The word \"%s\" is NOT a palindrome", word);
        }
    }
}