package com.example.springapp.controller.dto;

import lombok.*;
import org.springframework.lang.NonNull;

@Data
public class ArticleCreateDto {

    private String articleName;
    private String authorName;
}
