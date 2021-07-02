package com.example.hibernate.controller;

import com.example.hibernate.controller.dto.*;
import com.example.hibernate.service.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<StudentDto> getStudent(@RequestBody AddressDto dto) {
        return new ResponseEntity<>(studentService.getStudent(dto), HttpStatus.OK);
    }
}
