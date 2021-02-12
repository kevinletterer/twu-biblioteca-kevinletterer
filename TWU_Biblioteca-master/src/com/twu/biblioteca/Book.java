package com.twu.biblioteca;

import java.util.Collections;

public class Book {
    final private String name;
    final private String author;
    final private Integer year;
          private Boolean available;
    final private Integer id;

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
