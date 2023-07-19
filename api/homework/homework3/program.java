package api.homework.homework3;

import api.homework.mytools;

public class program {

        // Задание
        // Пусть дан произвольный список целых чисел.
        // 1) Нужно удалить из него чётные числа
        // 2) Найти минимальное значение
        // 3) Найти максимальное значение
        // 4) Найти среднее значение

    public static void main(String[] args) {

        int[] array = mytools.randomArray(5);
        System.out.printf("Пусть дан произвольный список чисел: %s\n", mytools.printArray(array));
        System.out.printf("Удалив четные числа получим: %s\n", mytools.delEvenNumber(array));
        System.out.printf("Минимальное значение данного списка: %s\n", mytools.minValue(array));
        System.out.printf("Максимальное значение данного списка: %s\n", mytools.maxValue(array));
        System.out.printf("Среднеее значение данного списка: %s\n", mytools.averangeValue(array));
        

    }

}