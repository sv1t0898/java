package oop.homework.homework7;

import oop.homework.homework7.operations.Addition;
import oop.homework.homework7.operations.Division;
import oop.homework.homework7.operations.Multiplication;
import oop.homework.homework7.operations.Subtraction;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Calculate calculate = new Calculate("2+2/2+4-11*2/3/2/3");
        System.out.println(calculate.getExpression());
        System.out.println(calculate.getExpression().size());
        calculate.calc();
        System.out.println(calculate.getCalculateLog());
        System.out.println(calculate.getResult());


    }

}
