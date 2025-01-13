package gb.hw.hw4;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonSerice personSerice;

    @GetMapping
    public String getAllPersons(Model model){
        model.addAttribute("p", personSerice.getAllPersons());
        return "persons";
    }

    @GetMapping("/{id}")
    public String getPersonById(@PathVariable int id, Model model){
        model.addAttribute("per", personSerice.getPersonById(id));
        return "person";
    }

}
