package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class PersonDB {

    public static void connect(){

        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        SessionFactory sessionFactory = new MetadataSources(registry)
                .buildMetadata()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        Person person = new Person("qwe", "qwe", 123, "ewq");
        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();
        session.close();

        

    }

}
