package com.example.demo;

import com.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {
    public static void main(String[] args) {
Configuration configuration=new Configuration();
configuration.configure("hibernate.cfg.xml");
SessionFactory sessionFactory=configuration
        .addAnnotatedClass(Student.class)
        .buildSessionFactory();
Session session=sessionFactory.getCurrentSession();
try {
    System.out.println("Creating new Student Objects");
    Student student=new Student("paul","Wall","pasd@gmail.com");
    session.beginTransaction();
    System.out.println("Saving student");
    session.save(student);
    session.getTransaction().commit();
    System.out.println("Done");

    }finally {
    sessionFactory.close();
    }
    }
}
