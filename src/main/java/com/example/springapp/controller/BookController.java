package com.example.springapp.controller;

import com.example.springapp.controller.dto.*;
import com.example.springapp.service.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<BookDto> createBook(@RequestBody BookCreateDto dto) {
        return new ResponseEntity<>(bookService.createBook(dto), HttpStatus.OK);
    }
}
