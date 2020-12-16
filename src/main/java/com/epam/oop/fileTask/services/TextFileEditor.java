package com.epam.oop.fileTask.services;

import com.epam.oop.fileTask.beans.FileI;

public class TextFileEditor {

    public void addToContent(FileI<String> file, String strToAdd) {
        file.setContent(file.getContent() + strToAdd);
    }

    public void rewriteContent(FileI<String> file, String newContent) {
        file.setContent(newContent);
    }

    public void clearContent(FileI<String> file) {
        file.setContent("");
    }

}
