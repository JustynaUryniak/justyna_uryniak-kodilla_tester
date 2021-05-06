package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
     Book book1 = BookManager.createBook("My Policeman", "Roberts Bethan");
     BookManager.books.add(book1);
     Book book2 = BookManager.createBook("The Song of Achilles", "Miller Madeline");
     BookManager.books.add(book2);
     Book book3 = BookManager.createBook("My Policeman", "Roberts Bethan");
     BookManager.books.add(book3);
        System.out.println(BookManager.books.size());
        System.out.println(book1.equals(book3));
        System.out.println(book1 == book3);
    }
}
