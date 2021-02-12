package com.twu.biblioteca;

import java.util.Collections;

public class Book {
    private String name;
    private String author;
    private Integer year;
    private Boolean available;

    public Book(String name, String author, Integer year, Boolean available){
        this.name = name;
        this.author = author;
        this.year = year;
        this.available = available;
    }

    public Boolean getAvailable() {
        return available;
    }

    public Integer getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){

        String bookString = "";

        bookString =
                name + String.join("", Collections.nCopies(20-name.length(), " ")) +
                author + String.join("", Collections.nCopies(15-author.length(), " ")) +
                year.toString()  + "\n"
        ;


        return bookString;
    }
}
