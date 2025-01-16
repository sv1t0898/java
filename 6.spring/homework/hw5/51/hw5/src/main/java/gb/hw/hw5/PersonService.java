package gb.hw.hw5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {


    private final PersonRepository personList;

    public PersonService(PersonRepository personList) {
        this.personList = personList;
    }

    public List<Person> getAllPersons() {
        return personList.findAll();
    }

    public Person getPersonById(Long id) {
        return personList.getReferenceById(id);
    }

    public List<Person> addAllPerson(List<Person> personList) {
        return this.personList.saveAll(personList);
    }

    public Person save(Person person) {
        return personList.save(person);
    }

    public void deleteById(Long id){
        personList.deleteById(id);
    }

    public void deleteAll(){
        personList.deleteAll();
    }
}