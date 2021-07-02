package com.example.hibernate.dao;

import com.example.hibernate.dao.entities.*;
import javax.persistence.*;
import org.hibernate.*;
import org.hibernate.query.Query;
import org.springframework.stereotype.*;

@Repository
public class UniversityDaoImpl implements UniversityDao {

    @PersistenceContext
    private EntityManager manager;

//    private SessionFactory sessionFactory;
//
//    public UniversityDaoImpl(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }

    @Override
    public void createUniversity(UniversityEntity university) {
        manager.persist(university);
//        Transaction transaction = null;
//        try {
//            Session session = sessionFactory.openSession();
//            transaction = session.beginTransaction();
//            session.save(university);
//            transaction.commit();
//        } catch (HibernateException e) {
//            transaction.rollback();
//            throw new HibernateException(e);
//        }
    }

    @Override
    public UniversityEntity getByTitle(String title) {
//        Transaction transaction = null;
//        try {
//            Session session = sessionFactory.openSession();
//            transaction = session.beginTransaction();
//            Query<UniversityEntity> query = session.createQuery("SELECT U FROM UniversityEntity U WHERE U.title=:title");
//            session.createQuery("update UniversityEntity set title=:title");
//            query.setParameter("title", title);
//            UniversityEntity university = query.getSingleResult();
//            System.out.println(university);
//            transaction.commit();
//            return university;
//        } catch (HibernateException e) {
//            transaction.rollback();
//            throw new HibernateException(e);
//        } catch (NoResultException e) {
//            return null;
//        }
        return null;
    }
}
