package com.epam.io.modern;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ModernCopyApp {
    public static void main(String[] args) {
        Path inputFile = Paths.get("java.course/src/main/java/files", "input.txt");
        Path outputFile = Paths.get("java.course/src/main/java/files", "copyResult.txt");
        try {
            Files.copy(inputFile, outputFile, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
