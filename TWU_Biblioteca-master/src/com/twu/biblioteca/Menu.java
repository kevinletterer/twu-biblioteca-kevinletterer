package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Menu {

   private String menuContent;


   public Menu(){
       this.menuContent = "Menu\n" + "1 - List of Books\n" + "2 - Check Out Book\n" + "3 - Return Book\n" + "4 - Quit" ;
   }

   public String getMenuContent() {
       return this.menuContent;
   }

   public void displayMenu(){
       System.out.println(getMenuContent());
   }

}

