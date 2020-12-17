package com.epam.classes.composition.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Text {
    private static final String TABULATION_FOR_TITLE = "\t\t\t";
    private Sentence title;
    private List<Sentence> sentences = new ArrayList<>();

    public void addSentences(Sentence ... sentences) {
        Collections.addAll(this.sentences, sentences);
    }

    public void print() {
        System.out.print(TABULATION_FOR_TITLE);
        title.print();
        sentences.forEach(Sentence::print);
        System.out.println();
    }

    public Sentence getTitle() {
        return title;
    }

    public void setTitle(Sentence title) {
        this.title = title;
    }
}
