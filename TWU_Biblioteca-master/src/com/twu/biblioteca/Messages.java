package com.twu.biblioteca;

public class Messages {

    private final String greeting;
    private final String wrongChoice;
    private final String wrongWithdraw;
    private final String wrongReturn;
    private final String rightWithdraw;
    private final String rightReturn;

    public  Messages(){
        this.greeting       =  "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n" +  "Press Enter to continue...";
        this.wrongChoice    =  "Please select a valid option!";
        this.wrongWithdraw  =  "Sorry, that book is not available";
        this.wrongReturn    =  "That is not a valid book to return";
        this.rightWithdraw  =  "Thank you! Enjoy the book";
        this.rightReturn    =  "Thank you for returning the book";

    }

    public String getGreet(){
        return this.greeting;
    }

    void displayGreet(){
        System.out.println(getGreet());
    }

    void displayWrongChoice(){
        System.out.println(this.wrongChoice);
    }

    void displayWrongWithdraw(){
        System.out.println(this.wrongWithdraw);
    }

    void displayWrongReturn(){
        System.out.println(this.wrongReturn);
    }

    void displayRightWithdraw(){
        System.out.println(this.rightWithdraw);
    }

    void displayRightReturn(){
        System.out.println(this.rightReturn);
    }
}



