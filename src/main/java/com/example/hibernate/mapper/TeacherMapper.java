//!!!second way to create modelMapper

//package com.example.hibernate.mapper;
//
//import com.example.hibernate.controller.dto.*;
//import com.example.hibernate.dao.entities.*;
//import lombok.*;
//import org.modelmapper.*;
//import org.springframework.stereotype.*;
//
//@Component
//@RequiredArgsConstructor
//public class TeacherMapper {
//
//    private final ModelMapper modelMapper;
//
//    public TeacherDto toDto(TeacherEntity teacherEntity) {
//        return modelMapper.map(teacherEntity, TeacherDto.class);
//    }
//
//    public TeacherEntity toEntity(TeacherDto dto) {
//        return modelMapper.map(dto, TeacherEntity.class);
//    }
//}
