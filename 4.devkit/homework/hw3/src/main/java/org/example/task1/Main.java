package org.example.task1;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Calcucate().<Number>sum(5,5));
        System.out.println(new Calcucate().multiply(5,5));
        System.out.println(new Calcucate().<Float>divide(5f,.54f));
        System.out.println(new Calcucate().<Number>subtract(3,5));


    }
}
