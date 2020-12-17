package com.epam.io.modern;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;

public class ModernWriterApp {
    public static void main(String[] args) {
        Path outputFile = Paths.get("src/main/resources", "outputNew.txt");
        try {
            Files.writeString(outputFile, '\n' + new Date().toString() + '\n', StandardOpenOption.APPEND);
            for (int i = 1; i <= 5; i++) {
                Files.writeString(outputFile, "Line " + i + '\n', StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
