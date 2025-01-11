package gb.hw.hw2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OutputController {

    @Autowired
    Output output;

    @GetMapping("")
    public String outputSalute(){
        output.log();
        return output.helloUser();
    }
}
