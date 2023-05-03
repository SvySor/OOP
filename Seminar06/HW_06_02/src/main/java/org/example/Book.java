package org.example;

import org.example.genre.Genre;

public abstract class Book {
    private Genre genre;
    private String title;
    private String author;

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book() {
    }
    public Book(Genre genre, String title, String author) {
        this.genre = genre;
        this.title = title;
        this.author = author;
    }
}
