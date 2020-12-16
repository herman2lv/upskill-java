package com.epam.oop.fileTask.main;

import com.epam.oop.fileTask.beans.Directory;
import com.epam.oop.fileTask.beans.File;
import com.epam.oop.fileTask.beans.FileI;
import com.epam.oop.fileTask.services.Printer;
import com.epam.oop.fileTask.services.Storage;
import com.epam.oop.fileTask.services.TextFileEditor;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addObject("/", new Directory("Users"));
        storage.addObject("//Users", new Directory("Herman"));
        storage.addObject("//Users/Herman", new Directory("Mails"));
        storage.addObject("//Users/Herman/Mails", new File<String>("Mail.txt"));
        storage.addObject("//Users/Herman", new Directory("Private_mails"));
        storage.addObject("//Users/Herman/Private_mails", new File<String>("Confidential_mail.txt"));
        storage.addObject("//Users/Herman", new Directory("Documents"));
        storage.addObject("//Users/Herman/Documents", new File<String>("Document.txt"));
        storage.addObject("//Users/Herman", new Directory("Study"));
        storage.addObject("//Users/Herman/Study", new File<String>("Student_book.txt"));
        System.out.println(storage.getStorage().keySet());
        storage.removeObject("//Users/Herman/Private_mails/Confidential_mail.txt");
        System.out.println(storage.getStorage().keySet());
        storage.rename("//Users", "Winners");
        System.out.println(storage.getStorage().keySet());
        TextFileEditor textFileEditor = new TextFileEditor();
        FileI<String> file = (File<String>) storage.getFile("//Winners/Herman/Mails/Mail.txt");
        textFileEditor.rewriteContent(file, """
                To be, or not to be, that is the question:
                Whether 'tis nobler in the mind to suffer
                The slings and arrows of outrageous fortune,
                """);
        textFileEditor.addToContent(file, """
                Or to take Arms against a Sea of troubles,
                And by opposing end them: to die, to sleep,
                No more.""");
        Printer printer = new Printer();
        printer.printToConsole(file);
        printer.saveFileToStorage(file);
        storage.removeObject("//Winners/Herman");
        System.out.println(storage.getStorage().keySet());
    }
}
