package com.example.springapp.controller;

import com.example.springapp.controller.dto.*;
import com.example.springapp.service.*;
import java.util.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        return new ResponseEntity<>(userService.createUser(userDto), HttpStatus.OK);
    }

//    @GetMapping
//    public ResponseEntity<List<UserListDto>> getUsers(@RequestParam Integer age) {
//        return new ResponseEntity<>(userService.getUsers(age), HttpStatus.OK);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<UserDto> getUser(@PathVariable Integer id) {
//        return new ResponseEntity<>(userService.getUser(id), HttpStatus.OK);
//    }

    @PostMapping("/employee")
    public ResponseEntity<UserDto> createEmployee(@RequestBody UserDto userDto) {
        return new ResponseEntity<>(userService.createUser(userDto), HttpStatus.OK);
    }
}
