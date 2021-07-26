package com.example.hibernate.service;

import com.example.hibernate.controller.dto.*;
import com.example.hibernate.dao.*;
import com.example.hibernate.dao.entities.*;
import com.example.hibernate.exception.*;
import java.nio.file.*;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

@Service
public class TeacherServiceImpl implements TeacherService{

    private TeacherRepository teacherRepository;
    private UniversityRepository universityRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository, UniversityRepository universityRepository) {
        this.teacherRepository = teacherRepository;
        this.universityRepository = universityRepository;
    }

    @Override
    public void createTeacher(TeacherDto dto) {
        TeacherEntity teacherEntity = new TeacherEntity();
        teacherEntity.setName(dto.getName());
        UniversityEntity universityEntity = universityRepository.findByTitle(dto.getUniversity());
        if (Objects.isNull(universityEntity)) {
            universityEntity = new UniversityEntity();
            universityEntity.setTitle(dto.getUniversity());
            universityRepository.save(universityEntity);
        }
        teacherEntity.setUniversity(universityEntity);
        teacherRepository.save(teacherEntity);
    }

    @Transactional
    @Override
    public List<TeacherDto> getTeachers() {
        List<TeacherDto> result = new ArrayList<>();
        TeacherDto teacher = new TeacherDto();
        result.add(teacher);
//        List<TeacherEntity> teacherEntities = teacherRepository.findAll();
//        teacherEntities.forEach(t -> {
//            TeacherDto dto = new TeacherDto();
//            dto.setId(t.getId());
//            dto.setName(t.getName());
//            dto.setUniversity(t.getUniversity().getTitle());
//            result.add(dto);
//        });
//        if (result.isEmpty()) {
//            //throw new AccessDeniedException("you don't have permission");
//            throw new ResourceNotFound("NOT FOUND");
//        }
        return result;
    }
}
