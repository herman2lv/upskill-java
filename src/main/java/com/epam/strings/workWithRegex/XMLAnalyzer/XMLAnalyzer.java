package com.epam.strings.workWithRegex.XMLAnalyzer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XMLAnalyzer {
    final static int INDEX_OF_SECOND_CHAR_IN_STRING = 1;
    final static int INDEX_OF_LAST_CHAR_IN_STRING = -1;
    final static int INDEX_OF_PRE_LAST_CHAR_IN_STRING = -2;

    public void analyze(String text) {
        Pattern tagPattern = Pattern.compile("<[^<>]+>");
        Matcher matcher = tagPattern.matcher(text);
        StringBuilder tabulation = new StringBuilder(" ");
        int previousTagPosition = 0;
        while (matcher.find()) {
            System.out.print(text.substring(previousTagPosition, matcher.start()).replaceAll("\\v", ""));
            previousTagPosition = matcher.end();
            if (matcher.group().indexOf('/') < 0) {
                System.out.printf("\n%sTag \"", tabulation);
                System.out.print(matcher.group().replaceAll("[<>/]", ""));
                System.out.print("\" (is not empty) contains: ");
                tabulation.append("\t");
            } else if (matcher.group().indexOf('/') == matcher.group().length() + INDEX_OF_PRE_LAST_CHAR_IN_STRING) {
                System.out.printf("\n%sTag \"", tabulation);
                System.out.print(matcher.group().replaceAll("[<>/]", ""));
                System.out.println("\" (is empty)");
            } else if (matcher.group().indexOf('/') == INDEX_OF_SECOND_CHAR_IN_STRING) {
                tabulation.delete(tabulation.length() + INDEX_OF_PRE_LAST_CHAR_IN_STRING,
                        tabulation.length() + INDEX_OF_LAST_CHAR_IN_STRING);
            }
        }
    }
}