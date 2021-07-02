package com.example.hibernate.controller;

import com.example.hibernate.controller.dto.*;
import com.example.hibernate.dao.entities.*;
import com.example.hibernate.service.*;
import java.util.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    private TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping
    public ResponseEntity<Void> createTeacher(@RequestBody TeacherDto dto) {
        teacherService.createTeacher(dto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<TeacherDto>> getTeacher() {
        return new ResponseEntity<>(teacherService.getTeachers(), HttpStatus.OK);
    }
}

