package org.example;

        //Настройте связь между вашим приложением и базой данных MySQL с использованием Hibernate.
        //Создайте несколько объектов Person и сохраните их в базу данных.

public class Main {
    public static void main(String[] args) {

        PersonDB.connect();

    }
}