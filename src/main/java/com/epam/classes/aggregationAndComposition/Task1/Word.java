package com.epam.classes.aggregationAndComposition.Task1;

public class Word {
    private String word;

    public Word(String word) {
        this.word = " " + word.strip();
    }

    public void setWord(String word) {
        this.word = " " + word.strip();
    }

    @Override
    public String toString() {
        return word;
    }
}
