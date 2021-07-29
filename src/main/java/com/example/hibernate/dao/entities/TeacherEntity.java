package com.example.hibernate.dao.entities;

import java.io.*;
import javax.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "teacher")
@AllArgsConstructor
@NoArgsConstructor
public class TeacherEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToOne
    private UniversityEntity university;
}
