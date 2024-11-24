package api.homework.homework6.homework6.src.main.java.ru.api.homework6;

import java.util.Objects;
import java.util.Random;

import static java.lang.String.format;

public class Cat {

    private static Random rmd = new Random();

    int ageCat;
    String nameCat;
    String colorCat;

    public Cat() {
        ageCat = 0;
        nameCat = "Barsik";
        colorCat = "Black";
    };

    public Cat(int ageCat, String nameCat, String colorCat){
        this.ageCat = ageCat;
        this.nameCat = nameCat;
        this.colorCat = colorCat;
    }

    @Override
    public String toString() {
        return String.format("(Возраст - %d, Имя - %s, Цвет - %s)", ageCat, nameCat, colorCat);//getAgeCat() + getNameCat() +  getColorCat()
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return ageCat == cat.ageCat && Objects.equals(nameCat, cat.nameCat) && Objects.equals(colorCat, cat.colorCat);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ageCat, nameCat, colorCat);//, rmd.nextInt());
    }
}
