package com.example.springapp.dao;

import com.example.springapp.dao.entities.*;
import java.util.*;
import org.springframework.data.jpa.repository.*;

public interface ArticleRepository extends JpaRepository<ArticleEntity, Integer> {

    ArticleEntity findByName(String name);

    List<ArticleEntity> findByAuthorName(String name);
}
