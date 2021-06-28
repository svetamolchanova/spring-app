package com.example.springapp.dao.entities;

import javax.persistence.*;

@Entity
public class ArticleEntity {

    @Id
    @GeneratedValue
    public Integer id;
    public Integer year;
    @ManyToOne
    @JoinColumn(name = "author")
    public AuthorEntity author;
    public String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public AuthorEntity getAuthor() {
        return author;
    }

    public void setAuthor(AuthorEntity author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
