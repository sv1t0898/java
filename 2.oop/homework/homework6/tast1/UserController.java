package oop.homework.homework6.tast1;

public interface UserController <T extends User>{
    /*
    *
    *   ___4.ISP___
    *   В реализованых интерфейсах соблюдается принцип ISP,
    *   классу реализующиму данный интерфейс, не приходится реализовать не нужные ему методы
    *
    * */
    void craeter(String firstName, String surName, String lastName);

}
