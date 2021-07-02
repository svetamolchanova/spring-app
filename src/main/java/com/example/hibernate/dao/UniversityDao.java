package com.example.hibernate.dao;

import com.example.hibernate.dao.entities.*;

public interface UniversityDao {

    void createUniversity(UniversityEntity university);

    UniversityEntity getByTitle(String title);
}
