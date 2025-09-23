package com.s.rattrouge.Entity;
import jakarta.persistence.*;



@Entity
public class Book {
    @Id
    @GeneratedValue()
    private Long id;
    private String title;
    private String author;
    private boolean available;

     @ManyToOne
     private Library library;

    public Book(Long id, String title, String author, boolean available, Library library) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = available;
        this.library = library;
    }

    public Book() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
