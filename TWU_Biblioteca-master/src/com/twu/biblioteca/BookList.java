package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;


public class BookList {

    List<Book> bookList = new ArrayList<>();
    Messages messages = new Messages();



    Book book1 = new Book("The Best Book",       "Kevin",   2023, true,  1);
    Book book2 = new Book("How to be Cool",      "Loreto",  2022, false, 2);
    Book book3 = new Book("Asian Food",          "Ramsey",  2025, true,  3);
    Book book4 = new Book("European Food",       "Ramsey",  2025, true,  4);
    Book book5 = new Book("Birds and Elephants", "Steve",   1987, true,  5);
    Book book6 = new Book("How to Sleep Better", "Unknown", 1165, true,  6);

    public BookList() {

        this.bookList.add(book1);
        this.bookList.add(book2);
        this.bookList.add(book3);
        this.bookList.add(book4);
        this.bookList.add(book5);
        this.bookList.add(book6);
    }

    public void withdraw(int i) {
        if(this.bookList.get(i).getAvailable()==true){
            this.bookList.get(i).setUnavailable();
            messages.displayRightWithdraw();
        }
       else{
            messages.displayWrongWithdraw();
        }
    }


    public void returns(int i) {
        if(this.bookList.get(i).getAvailable()==false){
            this.bookList.get(i).setAvailable();
            messages.displayRightReturn();
        }
        else{
            messages.displayWrongReturn();
        }
    }

    public String getBookList() {

        String bookString ="";
        for(Object book : this.bookList){
            bookString = bookString + book;
        }

        return bookString;
    }


    public void displayAvailableBooks(){
        for(Book book : this.bookList){
            if(book.getAvailable()){
                System.out.printf(book.toString());
                ;
            }
        }
    }

    public void displayUnavailableBooks(){
        for(Book book : this.bookList){
            if(!book.getAvailable()){
                System.out.printf(book.toString());
                ;
            }
        }
    }
}
