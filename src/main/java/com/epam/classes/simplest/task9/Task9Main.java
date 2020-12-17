package com.epam.classes.simplest.task9;

import java.util.List;

public class Task9Main {
    public static void main(String[] args) {
        BookDAO bookDAO = new BookDAO();
        BookService library = new BookService(bookDAO);
        System.out.print("Initial list of books:");
        library.print();
        String searchCriteria = "Blinov";
        List<Book> selectedBooks = library.getBooksByAuthor(searchCriteria);
        System.out.printf("%nBooks of the given author (%s): %s%n", searchCriteria, selectedBooks);
        searchCriteria = "Mcmilan";
        selectedBooks = library.getBooksByPublisher(searchCriteria);
        System.out.printf("%nBooks of the given publisher (%s): %s%n", searchCriteria, selectedBooks);
        int yearForSearch = 1970;
        selectedBooks = library.getBooksPublishedAfterYear(yearForSearch);
        System.out.printf("%nBooks published after given year (%d): %s%n", yearForSearch, selectedBooks);
    }
}
