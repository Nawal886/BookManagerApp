package com.bookmanager.controller;

import com.bookmanager.dao.BookDAO;
import com.bookmanager.model.Book;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class BookController extends JFrame {
    private JTable table;
    private DefaultTableModel model;

    public BookController() {
        setTitle("Book Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);

        model = new DefaultTableModel();
        table = new JTable(model);
        model.addColumn("ID");
        model.addColumn("Title");
        model.addColumn("Author");
        model.addColumn("Year");
        model.addColumn("User ID");
        model.addColumn("Description");
        model.addColumn("Cover");

        loadBookData();

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    private void loadBookData() {
        BookDAO dao = new BookDAO();
        List<Book> books = dao.getAllBooks();
        for (Book b : books) {
            model.addRow(new Object[]{
                b.getId(), b.getTitle(), b.getAuthor(), b.getYear(),
                b.getUserId(), b.getDescription(), b.getCoverPath()
            });
        }
    }
}
