package com.example.springapp.util;

import org.hibernate.*;
import org.hibernate.boot.registry.*;
import org.hibernate.cfg.*;

public class HibernateUtil {

    public static SessionFactory getSessionFactory() {
        try {
            Configuration configuration = new Configuration().configure();
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
            return configuration.buildSessionFactory(builder.build());
        } catch (Throwable e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static Session getSession() {
        Session session = getSession();
        if (session == null) {
            session = getSessionFactory().openSession();
        }
        return session;
    }
}
