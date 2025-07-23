package com.bookmanager.model;

public class Book {
    private int id;
    private String title;
    private String author;
    private int year;
    private int userId;
    private String description;
    private String coverPath;

    public Book(int id, String title, String author, int year, int userId, String description, String coverPath) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.userId = userId;
        this.description = description;
        this.coverPath = coverPath;
    }

    // Getters dan Setters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public int getUserId() { return userId; }
    public String getDescription() { return description; }
    public String getCoverPath() { return coverPath; }

    public void setId(int id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setYear(int year) { this.year = year; }
    public void setUserId(int userId) { this.userId = userId; }
    public void setDescription(String description) { this.description = description; }
    public void setCoverPath(String coverPath) { this.coverPath = coverPath; }
}
