package com.epam.io.modern;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ModernCopyApp {
    public static void main(String[] args) {
        Path inputFile = Paths.get("src/main/resources", "input.txt");
        Path outputFile = Paths.get("src/main/resources", "copyResult.txt");
        try {
            Files.copy(inputFile, outputFile, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
