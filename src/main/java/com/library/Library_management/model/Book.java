package com.library.Library_management.model;


import jakarta.persistence.GenerationType;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String author;
    private String genre;
    private int publicationYear;


}
