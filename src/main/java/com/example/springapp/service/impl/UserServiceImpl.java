package com.example.springapp.service.impl;

import com.example.springapp.controller.dto.*;
import com.example.springapp.dao.*;
import com.example.springapp.dao.entities.*;
import com.example.springapp.service.*;
import java.util.*;
import org.springframework.stereotype.*;

@Service
public class UserServiceImpl implements UserService {

    //private UserRepository dao;
//    private EmployeeRepository employeeRepository;
//
//    public UserServiceImpl(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }

//    @Override
//    public UserDto createUser(UserDto dto) {
//        UserEntity userEntity = new UserEntity();
//        userEntity.setFirstName(dto.getFirstName());
//        userEntity.setLastName(dto.getName());
//        dao.save(userEntity);
//
//        return dto;
//    }

//    @Override
//    public List<UserListDto> getUsers(Integer age) {
//        List<UserEntity> list = dao.findAllByAge(age);
//        List<UserListDto> users = new ArrayList<>();
//        list.forEach(u -> {
//            UserListDto user = new UserListDto();
//            user.setId(u.getId());
//            user.setLogin(u.getFirstName());
//            user.setName(u.getLastName());
//            System.out.println(user);
//            users.add(user);
//        });
//        return users;
//    }
//
//    @Override
//    public UserDto getUser(Integer id) {
//        UserEntity userEntity = dao.findById(id).orElse(null);
//        UserDto user = null;
//        if (Objects.nonNull(userEntity)) {
//            user = new UserDto();
//            user.setFirstName(userEntity .getFirstName());
//            user.setName(userEntity .getLastName());
//            user.setAge(userEntity .getAge());
//        }
//        return user;
//    }

    @Override
    public UserDto createUser(UserDto dto) {
//        EmployeeEntity userEntity = new EmployeeEntity();
//        userEntity.setFirstName(dto.getFirstName());
//        userEntity.setLastName(dto.getName());
//        userEntity.setCompany(dto.getCompany());
//        employeeRepository.save(userEntity);

        return null;
    }
}
