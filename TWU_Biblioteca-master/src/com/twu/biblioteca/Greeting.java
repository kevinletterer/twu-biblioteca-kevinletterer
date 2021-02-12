package com.twu.biblioteca;

public class Greeting {

    private String Greeting;

    public Greeting(){
        this.Greeting = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n" +  "Press Enter to continue...";
    }

    public String getGreet(){
        return this.Greeting;
    }

    void displayGreet(){
        System.out.println(getGreet());
    }
}



