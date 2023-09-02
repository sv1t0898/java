package oop.homework.homework7.operations;

public class Addition extends InputValues{
    public Addition(String a, String b) {
        super(a, b);
    }
    @Override
    public String toString() {
        return String.valueOf(this.getDoubleA() + this.getDoubleB());
    }
}
