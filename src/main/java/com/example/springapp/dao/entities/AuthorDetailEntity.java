package com.example.springapp.dao.entities;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "detail")
public class AuthorDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String note;
    @ManyToMany
    @JoinTable(name = "author_detail", joinColumns = {@JoinColumn(name = "detail_id")}, inverseJoinColumns = {@JoinColumn(name = "author_id")})
    private List<AuthorEntity> author;
}
