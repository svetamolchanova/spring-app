//package com.example.hibernate.util;
//
//import org.hibernate.*;
//import org.hibernate.boot.*;
//import org.hibernate.boot.registry.*;
//import org.hibernate.cfg.*;
//
//public class HibernateUtil {
//
//    public static SessionFactory getSessionFactory() {
//        try {
////            Configuration configuration = new Configuration().configure();
////            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
////            return configuration.buildSessionFactory(builder.build());
//
//            StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder() .configure("hibernate.cfg.xml").build();
//            Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
//            return metadata.getSessionFactoryBuilder().build();
//        } catch (Throwable e) {
//            throw new ExceptionInInitializerError(e);
//        }
//    }
//
//    public static Session getSession() {
//        return getSessionFactory().openSession();
//    }
//}
