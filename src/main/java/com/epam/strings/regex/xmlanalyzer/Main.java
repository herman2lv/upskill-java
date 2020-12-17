package com.epam.strings.regex.xmlanalyzer;

public class Main {
    public static void main(String[] args) {
        String text = """
            <notes>
               <note id = "1">
                   <to>Вася</to>
                   <from>Света</from>
                   <heading>Напоминание</heading>
                   <body>Позвони мне завтра!</body>
               </note>
               <note id = "2">
                   <to>Петя</to>
                   <from>Маша</from>
                   <heading>Важное напоминание</heading>
                   <body/>
               </note>
            </notes>""";
        XMLAnalyzer xmlAnalyzer = new XMLAnalyzer();
        xmlAnalyzer.analyze(text);

    }
}