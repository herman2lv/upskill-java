package com.epam.strings.workWithRegex.iText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextAnalyzer {

    public String[] getParagraphs(String string) {
        return string.split("[\\v]+");
    }
    public int getNumberOfSentences (String string) {
        Pattern pattern = Pattern.compile(".[.?!]+");
        Matcher matcher = pattern.matcher(string);
        int numberOfSentences = 0;
        while (matcher.find()) {
            numberOfSentences++;
        }
        return numberOfSentences;
    }
    public void sortParagraphsByNumberOfSentences (String[] paragraphs) {
        for (int gap = paragraphs.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < paragraphs.length; i++) {
                for (int j = i - gap;
                     j >= 0 && getNumberOfSentences(paragraphs[j]) > getNumberOfSentences(paragraphs[j + gap]) ;
                     j -= gap) {
                    String temp = paragraphs[j];
                    paragraphs[j] = paragraphs[j + gap];
                    paragraphs[j + gap] = temp;
                }
            }
        }
    }
    public void sortWordsInEachSentenceByLength(String[] paragraphs) {
        for (int i = 0; i < paragraphs.length; i++) {
            String[] sentences = splitParagraphBySentences(paragraphs[i]);
            for (int j = 0; j < sentences.length; j++) {
                sentences[j] = sortWordsByLength(sentences[j]);
            }
            paragraphs[i] = getParagraphFromSentences(sentences);
        }
    }
    public void sortWordsInEachSentenceByNumberOfChars(String[] paragraphs, String character) {
        for (int i = 0; i < paragraphs.length; i++) {
            String[] sentences = splitParagraphBySentences(paragraphs[i]);
            for (int j = 0; j < sentences.length; j++) {
                sentences[j] = sortWordsByNumberOfChars(sentences[j], character);
            }
            paragraphs[i] = getParagraphFromSentences(sentences);
        }
    }
    public String sortWordsByNumberOfChars (String sentence, String character) {
        sentence = sentence.strip().replaceAll("\\p{Punct}", "");
        String[] words = sentence.split("\s+");
        for (int gap = words.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < words.length; i++) {
                for (int j = i - gap;
                     j >= 0 && getNumberOfCertainChars(words[j], character) >=
                             getNumberOfCertainChars(words[j + gap], character);
                     j -= gap) {
                    if (getNumberOfCertainChars(words[j], character) >
                            getNumberOfCertainChars(words[j + gap], character)) {
                        String temp = words[j];
                        words[j] = words[j + gap];
                        words[j + gap] = temp;
                    } else if (words[j].compareToIgnoreCase(words[j + gap]) > 0){
                        String temp = words[j];
                        words[j] = words[j + gap];
                        words[j + gap] = temp;
                    }
                }
            }
        }
        return getSentenceFromWords(words);
    }
    private String[] splitParagraphBySentences(String paragraph) {
        return paragraph.split("[.?!]+\s*");
    }
    private String sortWordsByLength (String sentence) {
        sentence = sentence.strip().replaceAll("\\p{Punct}", "");
        String[] words = sentence.split("\s+");
        for (int gap = words.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < words.length; i++) {
                for (int j = i - gap;
                     j >= 0 && words[j].length() > words[j + gap].length() ;
                     j -= gap) {
                    String temp = words[j];
                    words[j] = words[j + gap];
                    words[j + gap] = temp;
                }
            }
        }
        return getSentenceFromWords(words);
    }
    private String getSentenceFromWords(String[] words){
        StringBuilder sentence = new StringBuilder();
        for (String word: words) {
            sentence.append(word).append(' ');
        }
        sentence.append('.');
        char firstLetter = sentence.toString().charAt(0);
        sentence.replace(0, 1, Character.toString(firstLetter).toUpperCase());
        return sentence.toString().replaceAll(" \\.", ".");
    }
    private String getParagraphFromSentences (String[] sentences) {
        StringBuilder sortedParagraph = new StringBuilder().append('\t');
        for (String sentence: sentences) {
            sortedParagraph.append(sentence).append(" ");
        }
        return sortedParagraph.toString();
    }
    private int getNumberOfCertainChars (String word, String character) {
        Pattern pattern = Pattern.compile(character);
        Matcher matcher = pattern.matcher(word);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }
    public void printText (String[] textByParagraphs) {
        for (String paragraph: textByParagraphs) {
            System.out.println(paragraph);
        }
        System.out.println();
    }
}