package com.example.springapp.service.impl;

import com.example.springapp.controller.dto.*;
import com.example.springapp.dao.*;
import com.example.springapp.dao.entities.*;
import com.example.springapp.service.*;
import java.util.*;
import org.springframework.stereotype.*;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public BookServiceImpl(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public BookDto createBook(BookCreateDto dto) {
        BookEntity book = new BookEntity();
        AuthorEntity author = new AuthorEntity();
        author.setName(dto.getAuthorName());
        authorRepository.save(author);
        book.setName(dto.getBookName());
        book.setAuthor(author);
        bookRepository.save(book);

        BookEntity result = bookRepository.findByName(dto.getBookName());
        BookDto bookDto = null;
        if (Objects.nonNull(result)) {
            bookDto = new BookDto();
            bookDto.setName(result.getName());
            AuthorDto authorDto = new AuthorDto();
            authorDto.setName(result.getAuthor().getName());
            bookDto.setAuthor(authorDto);
        }

        return bookDto;
    }
}
