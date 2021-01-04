package com.epam.io.outdated;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class BufferedReaderApp {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("src/main/resources/input.txt")) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.lines().collect(Collectors.toList()).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
