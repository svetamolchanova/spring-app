package com.example.hibernate.service;

import com.example.hibernate.controller.dto.*;
import com.example.hibernate.dao.*;
import com.example.hibernate.dao.entities.*;
import java.util.*;
import org.springframework.stereotype.*;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentDto> getStudents(String name) {
        List<StudentEntity> entities = studentRepository.findAllByName(name);
        return null;
    }

    @Override
    public StudentDto getStudent(AddressDto dto) {
        AddressEntity address = new AddressEntity(dto.getId(), dto.getCity(), dto.getStreet());
        StudentDto student = null;
        StudentEntity studentEntity = studentRepository.findByAddressCityAndAddressStreet(dto.getCity(), dto.getStreet()).orElse(null);
        if (Objects.nonNull(studentEntity)) {
            student = new StudentDto();
            student.setId(studentEntity.getId());
            student.setName(studentEntity.getName());
        }
        return student;
    }

    @Override
    public StudentDto getStudent(Integer id) {
        return new StudentDto();
    }

    @Override
    public void deleteStudent(Integer id) {
        //StudentEntity student = studentRepository.getById(id);
        studentRepository.deleteById(id);
    }
}
