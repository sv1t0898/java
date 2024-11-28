package org.example;


//Используя Reflection API, напишите программу,
// которая выводит на экран все методы класса String.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Arrays.stream(String.class.getMethods()).forEach(System.out::println);


    }
}