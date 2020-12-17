package com.epam.classes.composition.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sentence {
    private static final int BEGINNING_OF_ESCAPE_CHAR = 0;
    private static final int END_OF_ESCAPE_CHAR = 2;
    private final StringBuilder verticalWhitespace = new StringBuilder();
    private final StringBuilder tabulation = new StringBuilder();
    private List<Word> words = new ArrayList<>();

    public void addVerticalWhitespace() {
        verticalWhitespace.append('\n');
    }

    public void removeVerticalWhitespace() {
        verticalWhitespace.delete(BEGINNING_OF_ESCAPE_CHAR, END_OF_ESCAPE_CHAR);
    }

    public void addTabulation() {
        tabulation.append('\t');
    }

    public void removeTabulation() {
        tabulation.delete(BEGINNING_OF_ESCAPE_CHAR, END_OF_ESCAPE_CHAR);
    }

    public void print() {
        System.out.print(verticalWhitespace);
        System.out.print(tabulation);
        words.forEach(System.out::print);
    }

    public void addWords (Word ... words) {
        Collections.addAll(this.words, words);
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }
}
