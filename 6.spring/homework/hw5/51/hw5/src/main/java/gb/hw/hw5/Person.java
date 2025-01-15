package gb.hw.hw5;

import jakarta.persistence.*;

@Entity
@Table(name = "personHw5")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String yairBirth;
    private int phone;
    private String city;

    public Person() {
    }

    public Person(String name, String yairBirth, int phone, String city) {
        this.name = name;
        this.yairBirth = yairBirth;
        this.phone = phone;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYairBirth() {
        return yairBirth;
    }

    public void setYairBirth(String yairBirth) {
        this.yairBirth = yairBirth;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
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
                ", yairBirth='" + yairBirth + '\'' +
                ", phone=" + phone +
                ", city='" + city + '\'' +
                '}';
    }
}
