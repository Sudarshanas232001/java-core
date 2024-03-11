package com.learning.core.day6;

import java.util.*;

class Boook implements Comparable<Boook> {
    private int bookId;
    private String title;
    private double price;
    private String author;
    private Date dateOfPublication;

    public Boook(int bookId, String title, double price, String author, Date dateOfPublication) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.author = author;
        this.dateOfPublication = dateOfPublication;
    }

    @Override
    public String toString() {
        return bookId + " " + title + " " + price + " " + author + " " + dateOfPublication.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, title, price, author, dateOfPublication);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Boook other = (Boook) obj;
        return bookId == other.bookId && Objects.equals(title, other.title) && price == other.price &&
                Objects.equals(author, other.author) && Objects.equals(dateOfPublication, other.dateOfPublication);
    }

    @Override
    public int compareTo(Boook other) {
        return this.author.compareTo(other.author);
    }
}

public class D06P04 {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();
        // Predefined information of 5 Book details
        books.add(new Book(1001, "Python Learning", 715.0, "Martic.C.Brown", new Date(120, 1, 2)));
        books.add(new Book(1002, "Modern Mainframe", 295.0, "Sharad", new Date(97, 4, 19)));
        books.add(new Book(1003, "Java Programming", 523.0, "Gilad Bracha", new Date(84, 10, 23)));
        books.add(new Book(1004, "Read C++", 295.0, "Henry Harvin", new Date(84, 10, 19)));
        books.add(new Book(1005, ".Net Platform", 3497.0, "Mark J. Price", new Date(84, 2, 6)));

        // Print all the Book details by sorting the author names in ascending order
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}