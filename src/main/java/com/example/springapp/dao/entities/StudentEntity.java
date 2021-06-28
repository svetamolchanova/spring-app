package com.example.springapp.dao.entities;

import javax.persistence.*;

@Entity
@Table(name = "student_table")
//@PrimaryKeyJoinColumn(name = "student_id")
//@DiscriminatorValue("3")
public class StudentEntity extends UserEntity {

    private String university;

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
