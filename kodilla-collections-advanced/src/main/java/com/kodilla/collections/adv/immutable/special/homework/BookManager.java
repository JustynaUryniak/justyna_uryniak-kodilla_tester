package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {

    public static Set<Book> books = new HashSet<>();

    public static Book createBook(String title, String author) {
        Book newBook = new Book(title, author);
        for (Book book : books) {
            if(book.equals(newBook)) {
                return book;

            }
        }
        books.add(newBook);
        return newBook;
    }
}


