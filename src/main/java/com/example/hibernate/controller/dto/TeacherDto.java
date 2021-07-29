package com.example.hibernate.controller.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeacherDto {

    private Long id;
    private String name;
    private String firstName;
    private String university;
}
