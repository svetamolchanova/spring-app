package com.example.springapp.service.impl;

import com.example.springapp.controller.dto.*;
import com.example.springapp.dao.*;
import com.example.springapp.dao.entities.*;
import com.example.springapp.service.*;
import java.util.*;
import org.springframework.stereotype.*;

@Service
public class ArticleServiceImpl implements ArticleService {

    private ArticleRepository articleRepository;
    private AuthorRepository authorRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository, AuthorRepository authorRepository) {
        this.articleRepository = articleRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public ArticleDto createArticle(ArticleCreateDto dto) {
        ArticleEntity article = new ArticleEntity();
        AuthorEntity author = new AuthorEntity();
        author.setName(dto.getAuthorName());
        authorRepository.save(author);
        article.setName(dto.getArticleName());
        article.setAuthor(author);
        articleRepository.save(article);

        ArticleEntity result = articleRepository.findByName(dto.getArticleName());
        ArticleDto articleDto = null;
        if (Objects.nonNull(result)) {
            articleDto = new ArticleDto();
            articleDto.setName(result.getName());
            AuthorDto authorDto = new AuthorDto();
            authorDto.setName(result.getAuthor().getName());
            articleDto.setAuthor(authorDto);
        }

        return articleDto;
    }

    @Override
    public List<ArticleDto> getArticles(String authorName) {
        List<ArticleEntity> entities = articleRepository.findByAuthorName(authorName);
        List<ArticleDto> articles = new ArrayList<>();
        entities.forEach(a -> {
            ArticleDto dto = new ArticleDto();
            AuthorDto author = new AuthorDto();
            author.setName(a.getAuthor().getName());
            dto.setAuthor(author);
            dto.setName(a.getName());
            articles.add(dto);
        });

        return articles;
    }
}
