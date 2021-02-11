package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreetingTest{
    @Test
    public void testWelcomeMessage() {
        assertEquals("Welcome to Biblioteca!\n" +
                "Press Enter to continue...", Greeting.greet());
    }
}