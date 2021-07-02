package com.example.hibernate.dao.entities;

import java.io.*;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "university")
public class UniversityEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
