package gb.hw.hw4.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.stereotype.Component;

@Component
public class Connector {

    public final StandardServiceRegistry standardServiceRegistry;
    public SessionFactory sessionFactory;

    public Connector(){
        this.standardServiceRegistry = new StandardServiceRegistryBuilder()
                .configure().build();
        this.sessionFactory = new MetadataSources(standardServiceRegistry)
                .buildMetadata().buildSessionFactory();
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}
