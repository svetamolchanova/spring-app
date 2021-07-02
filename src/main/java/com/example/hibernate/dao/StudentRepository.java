package com.example.hibernate.dao;

import com.example.hibernate.dao.entities.*;
import java.util.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

    @Query("SELECT s from StudentEntity s order by s.name")
    List<StudentEntity> findAllByName(String name);

    Optional<StudentEntity> findById(Integer id);

    Optional<StudentEntity> findByAddressCityAndAddressStreet(String city, String street);

    Optional<StudentEntity> findByAddress(AddressEntity address);
}
