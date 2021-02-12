package com.twu.biblioteca;

public class Menu {

   private String menuContent;

   public Menu(){
       this.menuContent = "\nMenu:\n" + "\n1 - List of Books\n" + "2 - Check Out Book\n" + "3 - Return Book\n" + "4 - Quit" ;
   }

   public String getMenuContent() {
       return this.menuContent;
   }

   public void displayMenu(){
       System.out.println(getMenuContent());
   }
}