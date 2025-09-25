package com.s.rattrouge.Entity;
import jakarta.persistence.*;

import java.util.List;


@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String telephone;


   @OneToMany
   private List<Book> books;

    public Admin(Long id, String name, String email, String telephone, Library library) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.telephone = telephone;

    }
    public Admin(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }




}
