package com.epam.oop.fileTask.services;

import com.epam.oop.fileTask.beans.FileI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Printer {
    public void printToConsole(FileI file) {
        System.out.println('\n' + file.getParentDir() + file.getName() + ':');
        System.out.println(file.getContent());
    }

    public boolean saveFileToStorage(FileI fileToSave) {
        String path = "module.OOP/data/";
        File file = new File(path);
        file.mkdirs();
        path += fileToSave.getName();
        try (PrintStream printStream = new PrintStream(new FileOutputStream(path))) {
            printStream.print(fileToSave.getContent());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
