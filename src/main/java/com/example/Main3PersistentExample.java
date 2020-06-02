package com.example;

import com.example.entity.Dog;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main3PersistentExample {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Dog dog = new Dog("Fafik", 10, "Husky"); //transient

        session.persist(dog); //dog jest persistent

        dog.setAge(5);  //jest dalej w kontekscie persystencji i zmiany zostana wysłane do baz danych

        //ale przez to ze transaction. commit jest po odłoćzeniu evict to zmiany sie nie naniosą


       // session.evict(dog); //dog jest detached

        //dog.setAge(1);

        //Dog object = (Dog) session.merge(dog);

        session.lock(dog, LockMode.NONE);
        System.out.println(dog);
        transaction.commit();
        session.close();
    }
}
