package com.example.hibernate.dao;

import com.example.hibernate.dao.entities.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface TeacherRepository extends JpaRepository<TeacherEntity, Long> {
}
