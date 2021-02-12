package com.twu.biblioteca;
import java.io.*;
import java.util.Scanner;
import com.twu.biblioteca.Greeting;

public class BibliotecaApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Greeting greeting = new Greeting();
        Menu menu = new Menu();
        BookList bookList = new BookList();



        greeting.displayGreet();
        try{System.in.read();}
        catch(Exception e){}

            menu.displayMenu();
            System.out.println("Please choose an option and press enter");
            String choice = scanner.next();

            while (true) {
                if (choice.contentEquals("1")) {
                    System.out.println("Displaying Books:\n");
                    bookList.displayAvailableBooks();
                    menu.displayMenu();

                } else if (choice.contentEquals("2")) {
                    System.out.println("Select a book to withdraw");
                    bookList.displayAvailableBooks();
                    String choiceW = scanner.next();
                    try{bookList.withdraw(Integer.parseInt(choiceW)-1);}
                    catch (Exception e){
                        System.out.println("Please select a valid option!");
                    }

                    menu.displayMenu();


                }else if (choice.contentEquals("3")) {
                    System.out.println("Select a book to return");
                    bookList.displayUnavailableBooks();
                    String choiceW = scanner.next();
                    try{bookList.returns(Integer.parseInt(choiceW)-1);}
                    catch (Exception e){
                        System.out.println("Please select a valid option!");
                    }

                    menu.displayMenu();

                }else if(choice.contentEquals("4")){
                    break;
                } else {
                    System.out.println("Please select a valid option!");
                    menu.displayMenu();
                }

                choice = scanner.next();
            }
    }
}


