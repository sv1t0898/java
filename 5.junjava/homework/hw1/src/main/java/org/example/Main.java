package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        Напишите программу, которая использует Stream API для обработки списка чисел.
//                Программа должна вывести на экран среднее значение всех четных чисел в списке


        List<Integer> listNumber = new ArrayList();
        for (int i = 1; i < 11; i++) {
            listNumber.add(i);//new Random().nextInt(1000));
        }

        System.out.println(listNumber.stream().filter(n -> n % 2 == 0)
                .collect(Collectors.averagingInt(i -> i)));


    }
}