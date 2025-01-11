package gb.hw.hw2;


import org.springframework.stereotype.Service;

@Service
public class Output implements Salute{



    public void log(){
        System.out.println("User on star page.");
    }

    @Override
    public String helloUser() {
        return "Hello User.";
    }
}
