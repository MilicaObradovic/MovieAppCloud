package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "sv_40_2021")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String genre;
    private Long year;

    public Movie() {}

    public Movie(String title, String genre, Long year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }
}
