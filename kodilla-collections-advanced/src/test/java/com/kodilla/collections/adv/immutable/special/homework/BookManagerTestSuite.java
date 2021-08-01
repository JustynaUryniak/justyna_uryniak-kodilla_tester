package com.kodilla.collections.adv.immutable.special.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class BookManagerTestSuite {


    @Test
    public void createTwoBooks() {
        Set<Book> books = new HashSet<>();

        Book book1 = BookManager.createBook("Abc", "Abc");
        books.add(book1);
        Book book2 = BookManager.createBook("123", "123");
        books.add(book2);

        assertEquals(2, books.size());
        assertNotEquals(book1, book2);

    }

    @Test
    public void createTwoTheSameItems() {
        Set<Book> books = new HashSet<>();

        Book book1 = BookManager.createBook("Abc", "Abc");
        books.add(book1);
        Book book2 = BookManager.createBook("Abc", "Abc");
        books.add(book2);

        assertEquals(1, books.size());
        assertEquals(book1, book2);

    }
}