package com.example.springapp.dao;

import com.example.springapp.dao.entities.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Integer> {

    BookEntity findByName(String name);
}
