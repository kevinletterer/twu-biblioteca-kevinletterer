package com.twu.biblioteca;

import java.util.ArrayList;

public class Menu {

   private String menuContent;
   final private ArrayList bookList;

   public Menu(){
       this.menuContent = "Menu\n" + "1.- List of Books";

       bookList = new ArrayList();
       this.bookList.add("The Bible");
       this.bookList.add("Twilight");
       this.bookList.add("Harry Potter");

   }

   public String getMenuContent() {
       return this.menuContent;
   }

   public void displayMenu(){
       System.out.println(getMenuContent());
   }

    public String getBookList() {
       
       String books = "";
        for (var book: bookList) {
            books = books + book + "\n";
        }
           return books;
   }

   public void displayBookList(){
       System.out.println(getBookList());
   }
}

