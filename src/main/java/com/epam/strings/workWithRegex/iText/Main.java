package com.epam.strings.workWithRegex.iText;

public class Main {
    public static void main(String[] args) {
        String text = "\tThe first sentence of the first paragraph. The second sentence of the first paragraph. " +
                "The third sentence of the first paragraph.\n" +
                "\tThe first sentence of the second paragraph. The second sentence of the second paragraph.\n" +
                "\tThe first sentence of the third paragraph. The second sentence of the third paragraph. " +
                "The third sentence of the third paragraph. The fourth sentence of the third paragraph and the " +
                "longest sentence of the text.\n" +
                "\tAnd the last paragraph.";
        String character = "e"; //will be needed for sorting words in each sentence by number of certain chars
        TextAnalyzer textAnalyzer = new TextAnalyzer();
        String[] paragraphs = textAnalyzer.getParagraphs(text);
        System.out.println("\n\t\tInitial text:\n");
        textAnalyzer.printText(paragraphs);

        textAnalyzer.sortParagraphsByNumberOfSentences(paragraphs);
        System.out.println("\n\t\tText sorted by length of paragraphs:\n");
        textAnalyzer.printText(paragraphs);

        textAnalyzer.sortWordsInEachSentenceByLength(paragraphs);
        System.out.println("\n\t\tText sorted by length of words in sentences:\n");
        textAnalyzer.printText(paragraphs);

        textAnalyzer.sortWordsInEachSentenceByNumberOfChars(paragraphs, character);
        System.out.printf("\n\t\tText sorted by number of certain character (\"%s\") in the words:\n\n", character);
        textAnalyzer.printText(paragraphs);
    }
}