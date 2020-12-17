package com.epam.classes.simplest.task9;

import java.util.Arrays;
import java.util.List;

public class BookDAO {
    private final List<Book> books;

    public BookDAO() {
        Book book1 = new Book("The Count of Monte Cristo", 1999, "Dumas", "McMilan");
        Book book2 = new Book("Stay calm", 2005, "Blinov","McMilan");
        Book book3 = new Book("Lolita", 1985, "Nabokov","Samizdat");
        Book book4 = new Book("Key indicates of industrial revolution", 1953, "Pukirev","Dom Druku");
        Book book5 = new Book("Basics of radiophysics", 1968, "Landau","Dom Druku");
        this.books = Arrays.asList(book1, book2, book3, book4, book5);
    }

    public List<Book> getBooks() {
        return books;
    }
}
