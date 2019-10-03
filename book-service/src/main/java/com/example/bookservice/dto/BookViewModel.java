package com.example.bookservice.dto;

import java.util.List;

public class BookViewModel {

    private int bookId;
    private String title;
    private String author;
    private List<Note> notes;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
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


    public List getNotes() {
        return notes;
    }

    public void setNotes(List notes) {
        this.notes = notes;
    }
}
