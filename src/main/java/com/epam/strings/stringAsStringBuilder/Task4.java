package com.epam.strings.stringAsStringBuilder;

public class Task4 {
    public static void main(String[] args) {
        String word = "Communications";
        StringBuilder newWord = new StringBuilder();
        newWord.append(word.charAt(0)).append(word.charAt(1)).append(word.charAt(2))
                .append(word.charAt(3)).append(word.charAt(4)).append(word.charAt(5))
                .append(word.charAt(6)).append(word.charAt(13)).append(word.charAt(2));
        System.out.printf("The initial word is \"%s\",\nthe new word is \t\"%s\"", word, newWord);


    }
}