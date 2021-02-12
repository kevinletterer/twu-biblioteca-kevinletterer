package com.twu.biblioteca;

public class Messages {

    private String greeting;
    private String wrongChoice;
    private String wrongWithdraw;
    private String wrongReturn;
    private String rightWithdraw;
    private String rightReturn;

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



