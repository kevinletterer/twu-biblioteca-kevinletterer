package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MessagesTest {

    @Test
    public void testWelcomeMessage() {
        Messages messages = new Messages();
        assertEquals("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n" +
                "Press Enter to continue...", messages.getGreet());
    }
}