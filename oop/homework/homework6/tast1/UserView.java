package oop.homework.homework6.tast1;

import java.util.List;

public interface UserView<T extends User> {
    /*
     *
     *   ___4.ISP___
     *   В реализованых интерфейсах соблюдается принцип ISP,
     *   классу реализующиму данный интерфейс, не приходится реализовать не нужные ему методы
     *
     * */

    public void sendOnConsole(List<Student> student);
}
