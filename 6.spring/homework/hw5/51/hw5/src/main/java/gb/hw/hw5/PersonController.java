package gb.hw.hw5;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @GetMapping
    public String listPersons(Model model){
        model.addAttribute("personList", personService.getAllPersons());
        return "personsList";
    }
//
    @GetMapping("/{id}")
    public String getPersonById(@PathVariable("id") Long id, Model model){
        model.addAttribute("p", personService.getPersonById(id));
        return "person";
    }

    @PostMapping
    public String addAllPerson(@RequestBody List<Person> personList, Model model){
        model.addAttribute("personList", personService.addAllPerson(personList));
        return "personsList";
    }

    @PutMapping("/{id}")
    public Person changeById(@PathVariable Long id, @RequestBody Person person){
        person.setId(id);
        return personService.save(person);
    }

    @DeleteMapping("/{id}")
    public void deleteByid(@PathVariable Long id){
        personService.deleteById(id);
    }

    @DeleteMapping
    public void deleteAll(){
        personService.deleteAll();
    }




}
