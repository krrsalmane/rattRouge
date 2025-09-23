package com.s.rattrouge.Entity;
import jakarta.persistence.*;
import java.util.List;



@Entity

public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "library")
    private List<Book> books;
}
