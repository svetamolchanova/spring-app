package com.example.springapp.controller.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDto {

    private String name;
    private AuthorDto author;
}
