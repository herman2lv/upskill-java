package com.epam.io.otdated;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class WriterApp {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/output.txt");
        if (file.getParentFile().mkdir()) {
            System.out.printf("Have created dir \"%s\" at%n\t\"%s\"%n", file.getParentFile().getName(),
                    file.getParentFile().getParentFile().getAbsolutePath());
        }
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write(new Date().toString());
            fileWriter.write("\n");
            for (int i = 1; i <= 3; i++) {
                fileWriter.write("Line " + i + "\n");
            }
        }
        System.out.printf("File \"%s\" has been written at%n\t\"%s\"%n", file.getName(),
                file.getParentFile().getAbsolutePath());
    }
}
