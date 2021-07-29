package com.example.hibernate.mapper;

import org.modelmapper.*;

public interface ModelMapperProvider {

    ModelMapper createMapper();
}
