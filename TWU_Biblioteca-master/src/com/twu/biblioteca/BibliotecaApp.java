package com.twu.biblioteca;
import java.io.*;
import java.util.Scanner;
import com.twu.biblioteca.Greeting;

public class BibliotecaApp {

    public static void main(String[] args) {

        System.out.println(Greeting.greet());

        try{System.in.read();}
        catch(Exception e){}



    }


}


