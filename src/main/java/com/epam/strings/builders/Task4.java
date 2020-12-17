package com.epam.strings.builders;

public class Task4 {
    public static void main(String[] args) {
        String word = "Communications";
        String newWord = String.valueOf(word.charAt(0)) + word.charAt(1) + word.charAt(2)
                + word.charAt(3) + word.charAt(4) + word.charAt(5)
                + word.charAt(6) + word.charAt(13) + word.charAt(2);
        System.out.printf("The initial word is \"%s\",%nthe new word is \t\"%s\"", word, newWord);


    }
}
