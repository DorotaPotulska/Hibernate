package com.example;

import com.example.entity.Dog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main2SaveEntity {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(new Dog("Ares", 10,"Terier"));
        session.persist(new Dog("Pimpek", 2,"Dog"));
        session.persist(new Dog("Chili", 5,"Labrador"));
        session.persist(new Dog("Azor", 6,"Owczarek"));
        session.persist(new Dog("Miki", 3,"York"));
        session.persist(new Dog("Dzeki", 8,"Terier"));

        transaction.commit();
        session.close();
    }
}
