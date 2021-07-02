package com.example.hibernate.service;

import com.example.hibernate.controller.dto.*;
import java.util.*;

public interface StudentService {

    List<StudentDto> getStudents(String name);

    StudentDto getStudent(AddressDto dto);
}
