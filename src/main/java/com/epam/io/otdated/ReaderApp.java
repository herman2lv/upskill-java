package com.epam.io.otdated;

import java.io.FileReader;
import java.io.IOException;

public class ReaderApp {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("src/main/resources/input.txt")) {
            while (true) {
                int i = fileReader.read();
                if (i != -1) {
                    System.out.print((char) i);
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
