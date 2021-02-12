package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreetingTest{

    @Test
    public void testWelcomeMessage() {
        Greeting greeting = new Greeting();
        assertEquals("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n" +
                "Press Enter to continue...", greeting.getGreet());
    }
}