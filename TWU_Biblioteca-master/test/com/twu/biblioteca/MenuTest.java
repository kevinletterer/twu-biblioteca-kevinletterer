package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MenuTest {
    Menu menu = new Menu();

    @Test
    public void testMenuContent() {

        assertEquals("Menu\n" + "1.- List of Books", menu.getMenuContent());
    }

    @Test
    public void testBookList() {
        assertEquals("The Best Book       Kevin          2023\n" +
                "How to be Cool      Loreto         2022\n" +
                "Asian Food          Ramsey         2025\n", menu.getBookList());
    }
}
