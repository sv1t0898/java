package api.homework.homework1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Calculator {

    static Scanner scann = new Scanner(System.in);

    public static void main(String[] args) {

    }
    public static void run() /*throws IOException*/ {

        try {
            File logFile = new File("api/homework/homework1/calcLog.txt");
            FileWriter fileWriter = new FileWriter(logFile, true);

            for (int i = 0; i < 5; i++){
                fileWriter.write("hello" + i + '\n'); 
            }
            fileWriter.flush();
            fileWriter.close(); //при использование метода .close() автоматически применяется метод .flush()

            System.out.println("Введите первое число:");
            double a = scann.nextInt();
            System.out.println("Введите операцию: '-','+','*','/'.");
            char act = scann.next().charAt(0);
            System.out.println("Введите второе число:");
            double b = scann.nextInt();

            switch (act){
                case '-':
                    System.out.printf("%.2f - %.2f = %.2f", a, b, subtraction(a, b) );
                    break;
                case '+':
                    System.out.printf("%.2f + %.2f = %.2f", a, b, addition(a, b) );
                    break;
                case '*':
                    System.out.printf("%.2f * %.2f = %.2f", a, b, multiplic(a, b) );
                    break;
                case '/':
                    System.out.printf("%.2f / %.2f = %.2f", a, b, division(a, b) );
                    break;
                default:
                    System.out.println("Неверная операция");
            }
            
        } 
        catch (IOException ex) {
            System.out.println("error!");
        }

        
    }
 
    static double addition(double a, double b){
        return a + b;
        
    }

    static double subtraction(double a, double b){
        return a - b;
    }

    static double multiplic(double a, double b){
        return a * b;
    }

    static double division(double a, double b){
        return a / b;
    }

}
