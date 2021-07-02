package com.example.hibernate.dao.entities;

import javax.persistence.*;

@Entity
@Table(name = "university_detail")
public class UniversityDetailEntity {

    @Id
    @GeneratedValue
    private Integer id;
    private String note;
    @OneToOne
    private UniversityEntity university;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public UniversityEntity getUniversity() {
        return university;
    }

    public void setUniversity(UniversityEntity university) {
        this.university = university;
    }
}
