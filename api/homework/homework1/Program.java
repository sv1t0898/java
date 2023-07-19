package api.homework.homework1;

import api.homework.mytools;
import java.util.Scanner;

public class Program {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) /*throws IOException*/ {
        triangularN(10);
        prntNatNum(1000);
        Calculator.run();
    }
    
// 1) Вычислить n-ое треугольного число (сумма (()чисел от 1 до n), 
// n! (произведение чисел от 1 до n)

    static void triangularN(int n){
        System.out.printf("Сумма чисел от 1 до %d, равна - %.0f\n", n, mytools.triangularNumber(n));
        System.out.printf("Произведение чисел от 1 до %d, равно %.0f\n", n, mytools.factorial(n));
    }

// 2) Вывести все простые числа от 1 до 1000

    static void prntNatNum(int limitNum){
        for (int i = 1; i <= limitNum; i++){
            if (mytools.checkNatNum(i)){
                System.out.printf("%d, ", i);
            }
        }
    }

// 3) Реализовать простой калькулятор
    //calculator.run();

// 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.   
// Требуется восстановить выражение до верного равенства. Предложить хотя бы 
// одно решение или сообщить, что его нет)
    //static String enumeration(){
        // return 24+45=69
    //}

}
 