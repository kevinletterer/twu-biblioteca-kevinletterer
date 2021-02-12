package com.twu.biblioteca;
import java.io.*;
import java.util.Scanner;
import com.twu.biblioteca.Greeting;

public class BibliotecaApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Greeting greeting = new Greeting();
        Menu menu = new Menu();

        greeting.displayGreet();

        try{System.in.read();}
        catch(Exception e){}

        menu.displayMenu();
        System.out.println("Please choose an option and press enter");
        String choice = scanner.nextLine();
    }


}


