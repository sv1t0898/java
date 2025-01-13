package gb.hw.hw4.database;

import gb.hw.hw4.Person;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonDatabase {

    @Autowired
    private Connector connector;// = new Connector();
    private List<Person> personList;

    public List<Person> getAllPersons(){
       try (Session session = connector.getSession()){
           personList = session.createQuery("FROM Person", Person.class)
                   .getResultList();
           return personList;
       }catch (Exception e){
           e.printStackTrace();
       }
       return personList;
    }
}
