package com.example.springapp.controller.dto;

import lombok.*;
import org.springframework.lang.NonNull;

@Data
public class BookCreateDto {

    private String bookName;
    @NonNull
    private String authorName;
}
