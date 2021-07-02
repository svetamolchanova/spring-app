package com.example.hibernate.service;

import com.example.hibernate.controller.dto.*;
import com.example.hibernate.dao.*;
import com.example.hibernate.dao.entities.*;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

@Service
public class TeacherServiceImpl implements TeacherService{

    private TeacherDao teacherDao;
    private UniversityDao universityDao;

    public TeacherServiceImpl(@Qualifier("teacherDaoImpl") TeacherDao teacherDao, UniversityDao universityDao) {
        this.teacherDao = teacherDao;
        this.universityDao = universityDao;
    }

    @Override
    public void createTeacher(TeacherDto dto) {
        TeacherEntity teacherEntity = new TeacherEntity();
        teacherEntity.setName(dto.getName());
        UniversityEntity universityEntity = universityDao.getByTitle(dto.getUniversity());
        if (Objects.isNull(universityEntity)) {
            universityEntity = new UniversityEntity();
            universityEntity.setTitle(dto.getUniversity());
            universityDao.createUniversity(universityEntity);
        }
        teacherEntity.setUniversity(universityEntity);
        teacherDao.createTeacher(teacherEntity);
    }

    @Transactional
    @Override
    public List<TeacherDto> getTeachers() {
        List<TeacherDto> result = new ArrayList<>();
        List<TeacherEntity> teacherEntities = teacherDao.getTeachers();
        teacherEntities.forEach(t -> {
            TeacherDto dto = new TeacherDto();
            dto.setId(t.getId());
            dto.setName(t.getName());
            dto.setUniversity(t.getUniversity().getTitle());
            result.add(dto);
        });
        return result;
    }
}
