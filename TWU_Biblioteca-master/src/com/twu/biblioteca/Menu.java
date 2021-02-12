package com.twu.biblioteca;

public class Menu {

   private String menuContent;

   public Menu(){
       this.menuContent = "Menu\n" + "1.- List of Books";
   }

   public String getMenuContent() {
       return this.menuContent;
   }

   public void displayMenu(){
       System.out.println(getMenuContent());
   }
}
