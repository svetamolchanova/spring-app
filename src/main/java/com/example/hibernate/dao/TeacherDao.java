package com.example.hibernate.dao;

import com.example.hibernate.dao.entities.*;
import java.util.*;

public interface TeacherDao {

    void createTeacher(TeacherEntity teacher);

    List<TeacherEntity> getTeachers();
}
