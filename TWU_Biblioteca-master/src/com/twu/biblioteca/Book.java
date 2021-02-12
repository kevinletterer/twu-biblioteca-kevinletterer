package com.twu.biblioteca;

import java.util.Collections;

public class Book {
    private final String name;
    private final String author;
    private final Integer year;
    private Boolean available;
    private final Integer id;

    public Book(String name, String author, Integer year, Boolean available, Integer id){
        this.name = name;
        this.author = author;
        this.year = year;
        this.available = available;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable() {
        this.available = true;
    }

    public void setUnavailable() {
        this.available = false;
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
                id + " " +
                name + String.join("", Collections.nCopies(20 - name.length(), " ")) +
                author + String.join("", Collections.nCopies(15 - author.length(), " ")) +
                year.toString() + "\n"
            ;


        return bookString;
    }


}
