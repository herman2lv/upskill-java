package com.epam.io.otdated;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.stream.Collectors;

public class BufferedReaderApp {
    public static void main(String[] args) {
        long time = new Date().getTime();
        try (FileReader fileReader = new FileReader("java.course/src/main/java/files/input.txt")) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.lines().collect(Collectors.toList()).forEach(System.out::println);
            time = new Date().getTime() - time;
            System.out.println("\n\n" + time);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
