package com.example.springapp.controller.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDto {

    private String name;
    private AuthorDto author;
}
