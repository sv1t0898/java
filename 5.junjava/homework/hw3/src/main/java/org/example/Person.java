package org.example;

import java.io.Serializable;

public class Person implements Serializable {
    public String name;
    transient String surname;
    public int age;

    public Person (){}

    public Person(String name, int age, String surname){
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("Name - %s; Age - %s, Surname - %s", name, age, surname);
    }
}
