package com.example.hibernate.service;

import com.example.hibernate.controller.dto.*;
import com.example.hibernate.dao.*;
import com.example.hibernate.dao.entities.*;
import com.example.hibernate.mapper.*;
import java.util.*;
import lombok.*;
import org.modelmapper.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

@Service
public class TeacherServiceImpl implements TeacherService {

    private TeacherRepository teacherRepository;
    private UniversityRepository universityRepository;
    private ModelMapper modelMapper;
    //private TeacherMapper teacherMapper;

    @Autowired
    public TeacherServiceImpl(TeacherRepository teacherRepository, UniversityRepository universityRepository, ModelMapper modelMapper) {
        this.teacherRepository = teacherRepository;
        this.universityRepository = universityRepository;
        this.modelMapper = modelMapper;
    }

    public TeacherServiceImpl(){}

    @Override
    public void createTeacher(TeacherDto dto) {
        TeacherEntity teacherEntity = new TeacherEntity();
        teacherEntity.setName(dto.getFirstName());
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
        //result.add(teacher);
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

    @Override
    public TeacherDto getTeacher(Long id) {
        TeacherEntity teacherEntity = teacherRepository.getById(id);
        System.out.println(teacherEntity);
        TeacherDto dto = modelMapper.map(teacherEntity, TeacherDto.class);
        System.out.println(dto);
        return dto;
        //return teacherMapper.toDto(teacherEntity);
    }
}
