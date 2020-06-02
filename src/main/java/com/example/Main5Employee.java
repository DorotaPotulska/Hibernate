package com.example;

import com.example.entity.Employee;
import com.example.entity.Gender;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main5Employee {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee= new Employee("Adam","password1","666777888",20, Gender.MALE,"To jest opis");
                session.persist(employee);

        transaction.commit();
        session.close();
    }
}
