package com.example.hibernate.config;

import com.example.hibernate.mapper.*;
import lombok.*;
import org.modelmapper.*;
import org.springframework.context.annotation.*;

@Configuration
@RequiredArgsConstructor
public class MapperConfig {

    private final ModelMapperProvider modelMapperProvider;

//   constructor if we don't use annotation @RequiredArgsConstructor and final field
//    public MapperConfig(ModelMapperProvider modelMapperProvider) {
//        this.modelMapperProvider = modelMapperProvider;
//    }

    @Bean
    public ModelMapper modelMapper() {
        return modelMapperProvider.createMapper();
    }


//    !!!for second way to create modelMapper
//    @Bean
//    public ModelMapper modelMapper() {
//        ModelMapper mapper = new ModelMapper();
//        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//        return mapper;
//    }
}
