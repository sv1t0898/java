package exc.homework.homework2;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static java.lang.CharSequence.compare;
import static java.lang.String.format;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1:");
        System.out.println(returnFloat(scanner));
        System.out.println("Задание 2:");
        System.out.println("Деление на 0.0 даст \"infinity\" и исключение не выбросит.");
        System.out.println("Задание 3:");
        System.out.println("Ошибка в том что попытка поймать - Throwable стоит первой а он родитель всех исключений.");
        System.out.println("Задание 4:");
        System.out.println(emptyString(scanner));
    }

    /*
    * 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
    * вместо этого, необходимо повторно запросить у пользователя ввод данных.
    * */

    public static String returnFloat(Scanner scanner){
        String retur = null;
        System.out.print("Введите дробное число типа float: ");
        try {
            Float inputNum = Float.valueOf(scanner.nextLine().replace(",", "."));
            retur = format("Возврат введенного значения - %f", inputNum);
        } catch (NumberFormatException e){
            System.out.printf("%s, Это не число:(, попробуй ещё. \n", e );
            returnFloat(scanner);
        }
        return retur;
    }

    /*
    * Задание 2. Найти ошибку в коде.
    *
    * try {
    *    int d = 0;
    *    double catchedRes1 = intArray[8] / d;                  // деление на 0.0 даст "infinity" и исключение не выбросит
    *    System.out.println("catchedRes1 = " + catchedRes1);
    * } catch (ArithmeticException e) {
    *    System.out.println("Catching exception: " + e);
    *    }
    *
    * */

    /*
    * Задание 3. Найти ошибку в коде.
    *
    * */

//    public static void main(String[] args) throws Exception {
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(23, 234);
//            int[] abc = { 1, 2 };
//            abc[3] = 9;
//        } catch (Throwable ex) {  // при такой последовательность мы не поймаем ниже следующие исключения т.к. Throwable родитель всех исключений
//            System.out.println("Что-то пошло не так...");
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        }
//    }
//    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//        System.out.println(a + b);
//    }

    /*
    * 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    * */

    public static String emptyString(Scanner scanner){
        String retur = null;
        System.out.print("Введи стркоу(не пустую): ");

        retur = scanner.nextLine();
        if (retur.length() == 0){
            throw new NoSuchElementException("- Пустые строки вводить нельзя.");
        }
        return retur;
    }
}
