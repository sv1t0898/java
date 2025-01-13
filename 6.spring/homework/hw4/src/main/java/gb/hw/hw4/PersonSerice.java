package gb.hw.hw4;


import gb.hw.hw4.database.PersonDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonSerice {

    @Autowired
    private PersonDatabase personDatabase;

    public List<Person> getAllPersons(){
        return personDatabase.getAllPersons();
    }

    public Person getPersonById(int id){
        return personDatabase.getAllPersons().get(id - 1);
    }

}
