package oop.homework.homework6.tast1;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        if (o1.toString().length() > o2.toString().length()){return 1;}
        else if (o1.toString().length() < o2.toString().length()){return -1;}
        else {return 0;}
    }
}
