package com.example.hibernate.dao;

import com.example.hibernate.dao.entities.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface UniversityRepository extends JpaRepository<UniversityEntity, Long> {

    UniversityEntity findByTitle(String title);
}
