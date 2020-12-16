package com.epam.io.otdated;

import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class ReaderApp {
    public static void main(String[] args) {
        long time = new Date().getTime();
        try (FileReader fileReader = new FileReader("java.course/src/main/java/files/input.txt")) {
            while (true) {
                int i = fileReader.read();
                if (i != -1) {
                    System.out.print((char) i);
                } else {
                    break;
                }
            }
            time = new Date().getTime() - time;
            System.out.println("\n\n" + time);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
