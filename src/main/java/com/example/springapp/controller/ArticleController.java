package com.example.springapp.controller;

import com.example.springapp.controller.dto.*;
import com.example.springapp.service.*;
import java.util.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    private ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @PostMapping
    public ResponseEntity<ArticleDto> createArticle(@RequestBody ArticleCreateDto dto) {
        return new ResponseEntity<>(articleService.createArticle(dto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<ArticleDto>> getArticles(@RequestParam String authorName) {
        return new ResponseEntity<>(articleService.getArticles(authorName), HttpStatus.OK);
    }
}
