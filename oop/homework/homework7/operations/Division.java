package oop.homework.homework7.operations;

public class Division extends InputValues{
    public Division(String a, String b) {
        super(a, b);
    }


    @Override
    public String toString() {
        return String.valueOf(super.getDoubleA() / super.getDoubleB());
    }
}
