package com.epam.io.otdated;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class CopyApp {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("java.course/src/main/java/files/output.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter("java.course/src/main/java/files/copyResult.txt")) {
            List<String> content = bufferedReader.lines().collect(Collectors.toList());
            for (String s : content) {
                fileWriter.write(s + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
