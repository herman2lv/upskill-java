package com.epam.classes.simplest.task9;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    private final BookDAO bookDAO;

    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }


    public List<Book> getBooksByAuthor(String author) {
        List<Book> selectedBooks = new ArrayList<>();
        for (Book book: bookDAO.getBooks()) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                selectedBooks.add(book);
            }
        }
        return selectedBooks;
    }

    public List<Book> getBooksByPublisher(String publisher) {
        List<Book> selectedBooks = new ArrayList<>();
        for (Book book: bookDAO.getBooks()) {
            if (book.getPublisher().equalsIgnoreCase(publisher)) {
                selectedBooks.add(book);
            }
        }
        return selectedBooks;
    }

    public List<Book> getBooksPublishedAfterYear(int year) {
        List<Book> selectedBooks = new ArrayList<>();
        for (Book book: bookDAO.getBooks()) {
            if (book.getYear() >= year) {
                selectedBooks.add(book);
            }
        }
        return selectedBooks;
    }

    public void print() {
        System.out.println(bookDAO.getBooks());
    }
}
