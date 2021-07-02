package com.example.hibernate.dao;

import com.example.hibernate.dao.entities.*;
import java.util.*;
import javax.persistence.*;
import javax.persistence.criteria.*;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.springframework.stereotype.*;

@Repository
public class TeacherDaoImpl implements TeacherDao {

    @PersistenceContext
    private EntityManager manager;

    private SessionFactory sessionFactory;

//    public TeacherDaoImpl(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
//
    @Override
    public void createTeacher(TeacherEntity teacher) {
//        Transaction transaction = null;
//        try {
//            Session session = sessionFactory.openSession();
//            transaction = session.beginTransaction();
//            session.save(teacher);
//            transaction.commit();
//        } catch (HibernateException e) {
//            transaction.rollback();
//            throw new HibernateException(e);
//        }
    }

//    @Override
//    public List<TeacherEntity> getTeachers() {
//        Transaction transaction = null;
//        List<TeacherEntity> list = null;
//        try {
//            Session session = sessionFactory.openSession();
//            TeacherEntity entity = new TeacherEntity();
//            transaction = session.beginTransaction();
//            CriteriaBuilder builder = session.getCriteriaBuilder();
//            CriteriaQuery<TeacherEntity> query = builder.createQuery(TeacherEntity.class);
//            query.from(TeacherEntity.class);
////            query.where(builder.equal(teacher.get("title"), university));
//            list = session.createQuery(query).getResultList();
//
//            transaction.commit();
//        } catch (HibernateException e) {
//            transaction.rollback();
//            throw new HibernateException(e);
//        }
//        return list;
//    }

    @Override
    public List<TeacherEntity> getTeachers() {
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<TeacherEntity> query = builder.createQuery(TeacherEntity.class);
        query.from(TeacherEntity.class);
        return manager.createQuery(query).getResultList();
    }
}
