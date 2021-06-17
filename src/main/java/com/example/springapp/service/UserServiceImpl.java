package com.example.springapp.service;

import com.example.springapp.controller.dto.*;
import com.example.springapp.dao.*;
import com.example.springapp.dao.entities.*;
import org.springframework.stereotype.*;

@Service
public class UserServiceImpl implements UserService {

    private UserDao dao;

    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public UserDto createUser(UserDto dto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName(dto.getFirstName());
        userEntity.setLastName(dto.getName());
        dao.save(userEntity);

        return dto;
    }
}
