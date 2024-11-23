package oop.homework.homework4;

import java.util.List;

public interface UserView<T extends User> {

    public void userView(List<T> teachers);
}
