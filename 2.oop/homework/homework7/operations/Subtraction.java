package oop.homework.homework7.operations;

public class Subtraction extends InputValues{
    public Subtraction(String a, String b) {
        super(a, b);
    }


    @Override
    public String toString() {
        return String.valueOf(super.getDoubleA() - super.getDoubleB());
    }
}
