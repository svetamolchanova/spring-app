package com.example.hibernate.mapper;

import com.example.hibernate.controller.dto.*;
import com.example.hibernate.dao.entities.*;
import java.util.*;
import javax.annotation.*;
import org.modelmapper.*;
import org.modelmapper.convention.*;
import org.springframework.stereotype.*;

@Service
public class ModelMapperProviderImpl implements ModelMapperProvider {

    private ModelMapper modelMapper;

    @Override
    public ModelMapper createMapper() {
        return modelMapper;
    }

    @PostConstruct
    private ModelMapper createModelMapper() {
        modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        modelMapper.createTypeMap(TeacherEntity.class, TeacherDto.class)
                .addMappings(mapping -> mapping.skip(TeacherDto::setName))
                .addMappings(mapping -> mapping.map(TeacherEntity::getName, TeacherDto::setFirstName))
                .addMappings(mapping -> mapping.using(universityConverter).map(TeacherEntity::getUniversity, TeacherDto::setUniversity));

        modelMapper.createTypeMap(TeacherDto.class, TeacherEntity.class)
                .addMappings(mapping -> mapping.map(TeacherDto::getFirstName, TeacherEntity::setName));

        modelMapper.createTypeMap(StudentEntity.class, StudentDto.class)
                .addMappings(mapping -> mapping.skip(StudentDto::setId));

        return modelMapper;
    }

    private Converter<UniversityEntity, String> universityConverter = src -> {
        if (Objects.isNull(src.getSource())) {
            return null;
        }
        return src.getSource().getTitle();
    };
}
