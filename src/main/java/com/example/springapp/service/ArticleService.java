package com.example.springapp.service;

import com.example.springapp.controller.dto.*;
import java.util.*;

public interface ArticleService {

    ArticleDto createArticle(ArticleCreateDto dto);

    List<ArticleDto> getArticles(String authorName);
}
