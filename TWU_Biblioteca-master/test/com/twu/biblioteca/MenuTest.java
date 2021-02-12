package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MenuTest {
    @Test
    public void testMenuContent() {
        Menu menu = new Menu();
        assertEquals("Menu\n" + "1.- List of Books", menu.getMenuContent());
    }
}
