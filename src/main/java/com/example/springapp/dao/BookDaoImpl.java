package com.example.springapp.dao;

import com.example.springapp.dao.entities.*;
import com.example.springapp.util.*;
import org.hibernate.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.jta.*;

@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public BookEntity find(Integer id) {
        BookEntity book = null;
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSession();
            transaction = session.beginTransaction();
            book = session.get(BookEntity.class, id);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            throw new HibernateException(e);
        }
        return book;
    }
}
