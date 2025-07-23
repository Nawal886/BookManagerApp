package com.bookmanager;

import javax.swing.SwingUtilities;
import com.bookmanager.controller.BookController;

public class BookManagerApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(BookController::new);
    }
}
