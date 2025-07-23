package com.bookmanager.dao;

import com.bookmanager.model.Book;
import java.sql.*;
import java.util.*;

public class BookDAO {
    private final String DB_URL = "jdbc:mysql://localhost:3306/bookdb";
    private final String USER = "root";
    private final String PASS = "";

    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM books")) {

            while (rs.next()) {
                books.add(new Book(
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("author"),
                    rs.getInt("year"),
                    rs.getInt("userId"),
                    rs.getString("description"),
                    rs.getString("coverPath")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return books;
    }

    // Tambahan fungsi seperti insert, update, delete bisa kamu buatkan juga
}
