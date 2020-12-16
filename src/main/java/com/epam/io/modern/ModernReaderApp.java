package com.epam.io.modern;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ModernReaderApp {
    public static void main(String[] args) {
        Path inputFile = Paths.get("java.course/src/main/java/files", "input.txt");
        List<String> content = new ArrayList<>();
        try {
            content = Files.readAllLines(inputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        content.forEach(System.out::println);

    }
}
