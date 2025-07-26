package com.kodnest.EMSUsingHibernate;

/**
 * Hello world!
 *
 */
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App {
    public static SessionFactory factory;

    static {
        factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }

    public void addEmployee(String name, int salary, String department) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Employee e = new Employee(name, salary, department);
        session.persist(e);
        tx.commit();
        session.close();
    }

    public Employee getEmployee(int id) {
        Session session = factory.openSession();
        Employee e = session.find(Employee.class, id);
        session.close();
        return e;
    }

    public void updateEmployee(Employee e) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.merge(e);
        tx.commit();
        session.close();
    }

    public void deleteEmployee(int id) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Employee e = session.find(Employee.class, id);
        if (e != null) session.remove(e);
        tx.commit();
        session.close();
    }
}

