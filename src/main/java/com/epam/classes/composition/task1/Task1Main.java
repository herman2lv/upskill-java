package com.epam.classes.composition.task1;

public class Task1Main {
    public static void main(String[] args) {
        Sentence title = new Sentence();
        title.addWords(new Word("The"), new Word("Title"));
        Sentence sentence1 = new Sentence();
        sentence1.addWords(new Word("First"), new Word("word"), new Word("of"),
                new Word("the"), new Word("first"), new Word("sentence."));
        sentence1.addVerticalWhitespace();
        sentence1.addTabulation();
        Sentence sentence2 = new Sentence();
        sentence2.addWords(new Word("Second"), new Word("sentence"), new Word("of"),
                new Word("the"), new Word("first"), new Word("paragraph."));
        Text text = new Text();
        text.setTitle(title);
        text.addSentences(sentence1, sentence2);
        System.out.println("The first version of the text:\n");
        text.print();
        Sentence sentence3 = new Sentence();
        sentence3.addWords(new Word("One"), new Word("more"), new Word("additional"),
                new Word("sentence"), new Word("of"), new Word("the"), new Word("new"), new Word("paragraph."));
        sentence3.addTabulation();
        sentence3.addVerticalWhitespace();
        text.addSentences(sentence3);
        System.out.println("\nThe text after adding of one more sentence:\n");
        text.print();

    }
}
