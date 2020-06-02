package com.example;

import com.example.entity.Dog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main4UpdateEntity {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        //Dog dog = session.find(Dog.class,1L); //egger - jest wysłane zapytanie //null - gdy id nie istenieje

        //Dog dog = session.get(Dog.class, 1L);//egger //null - gdy id nie istenieje

        //Dog dog = session.load(Dog.class, 1L);//lazy, dopiero jak chcemy go uzyc to jest pobierany // exception gdy id nie istnieje


        //Dog dog = session.find(Dog.class,1808L); // null

        Dog dog = session.find(Dog.class,1L);

        dog.setAge(100);

        System.out.println(dog);


        transaction.commit();
        session.close();
    }
}
