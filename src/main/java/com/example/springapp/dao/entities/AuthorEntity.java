package com.example.springapp.dao.entities;

import java.util.*;
import javax.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "author")
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
}
