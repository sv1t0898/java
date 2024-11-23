package oop.homework.homework6.tast1;

import java.time.LocalDate;

public class User {

    private String firstName;
    private String secondName;
    private String lastName;
    private LocalDate dataOfBirth;

    public User(String firstName, String secondName, String lastName){//, LocalDate dataOfBirth){
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        //this.dataOfBirth = dataOfBirth;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
