package com.example.hibernate.controller;

import com.example.hibernate.controller.dto.*;
import com.example.hibernate.service.*;
import io.swagger.annotations.*;
import java.net.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import static javax.servlet.http.HttpServletResponse.SC_OK;

@Api(tags = "Student API")
@RestController
@RequestMapping("/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @ApiResponses(value = {@ApiResponse(code = SC_OK, message = "ok")})
    @PostMapping
    public ResponseEntity<StudentDto> getStudent(@RequestBody AddressDto dto) {
        return new ResponseEntity<>(studentService.getStudent(dto), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudent(@PathVariable Integer id) {
        return new ResponseEntity<>(studentService.getStudent(id), HttpStatus.OK);
    }

//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteStudent(@PathVariable Integer id) {
//        studentService.deleteStudent(id);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStudent(@PathVariable Integer id) {
        studentService.deleteStudent(id);
    }
}
