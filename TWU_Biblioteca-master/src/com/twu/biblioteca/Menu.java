package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Menu {

   private String menuContent;
   final private List bookList;
    Book book1 = new Book("The Best Book", "Kevin", 2023, true);
    Book book2 = new Book("How to be Cool", "Loreto", 2022, true);
    Book book3 = new Book("Asian Food", "Ramsey", 2025, true);

   public Menu(){
       this.menuContent = "Menu\n" + "1.- List of Books";

       bookList = new ArrayList();
       this.bookList.add(book1);
       this.bookList.add(book2);
       this.bookList.add(book3);

   }

   public String getMenuContent() {
       return this.menuContent;
   }

   public void displayMenu(){
       System.out.println(getMenuContent());
   }

    public String getBookList() {

       String bookString ="";
       for(Object book : this.bookList){
           bookString += book.toString();
       }

           return bookString;
   }

   public void displayBookList(){

       for(Object book : this.bookList){
           System.out.printf(book.toString());

       }
   }
}

