package gb.hw.hw5;


import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @GetMapping
    public List<Person> listPersons(){
        return personService.getAllPersons();
    }

    @GetMapping("/{id}")
    public Optional<Person> getPersonById(@PathVariable("id") Long id){
        return personService.getPersonById(id);
    }

    @PostMapping
    public List<Person> addAllPerson(@RequestBody List<Person> personList){
        return personService.addAllPerson(personList);
    }

    @PutMapping("/{id}")
    public Person changeById(@PathVariable Long id, @RequestBody Person person){
        person.setId(id);
        return personService.save(person);
    }




}
