package com.s.rattrouge.Dto;




public class LibraryDTO {

    private String name;
    private String adresse;

    public LibraryDTO(String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
    }
    public LibraryDTO(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
