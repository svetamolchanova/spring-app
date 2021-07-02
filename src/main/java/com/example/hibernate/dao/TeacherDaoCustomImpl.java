//package com.example.hibernate.dao;
//
//
//import com.example.hibernate.dao.entities.*;
//import com.example.hibernate.util.*;
//import java.util.*;
//import javax.persistence.*;
//import org.hibernate.*;
//import org.springframework.beans.factory.annotation.*;
//import org.springframework.stereotype.*;
//
//@Qualifier("customDao")
//@Repository
//public class TeacherDaoCustomImpl implements TeacherDao {
//
//    @Override
//    public void createTeacher(TeacherEntity teacher) {
//        Transaction transaction = null;
//        try {
//            Session session = HibernateUtil.getSession();
//            transaction = session.beginTransaction();
//            session.save(teacher);
//            transaction.commit();
//        } catch (HibernateException e) {
//            transaction.rollback();
//            throw new HibernateException(e);
//        }
//    }
//
//    @Override
//    public List<TeacherEntity> getTeachers() {
//        Transaction transaction = null;
//        List<TeacherEntity> list = null;
//        try {
//            Session session = HibernateUtil.getSession();
//            transaction = session.beginTransaction();
//            TypedQuery<TeacherEntity> query = session.createQuery("FROM TeacherEntity", TeacherEntity.class);
//            list = query.getResultList();
//            transaction.commit();
//        } catch (HibernateException e) {
//            transaction.rollback();
//            throw new HibernateException(e);
//        }
//        return list;
//    }
//}
