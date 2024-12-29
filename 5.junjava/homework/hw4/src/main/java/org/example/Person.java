package org.example;

import javax.persistence.*;

@Entity
@Table(name = "hw.Person")

public class Person {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Hobbie")
    private String hobbie;
    @Column(name = "Age")
    private int age;
    @Column(name = "City")
    private String city;

    public Person(){}

    public Person(String name, String hobbie, int age, String city) {
        this.name = name;
        this.hobbie = hobbie;
        this.age = age;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobbie='" + hobbie + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
