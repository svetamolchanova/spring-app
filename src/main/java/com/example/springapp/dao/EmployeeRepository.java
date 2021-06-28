package com.example.springapp.dao;

import com.example.springapp.dao.entities.*;
import java.util.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

//    UserEntity findByFirstName(String name);
//
//    List<UserEntity> findAllByFirstNameOrLastName(String firstName, String LastName);
//
//    List<UserEntity> findAllByAge(Integer age);
}
