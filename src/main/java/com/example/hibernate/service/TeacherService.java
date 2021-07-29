package com.example.hibernate.service;

import com.example.hibernate.controller.dto.*;
import java.util.*;

public interface TeacherService {

    void createTeacher(TeacherDto dto);

    List<TeacherDto> getTeachers();

    TeacherDto getTeacher(Long id);
}
