package api.homework.homework2.calculatorWithLog;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    static Scanner scann = new Scanner(System.in);

    public static void main(String[] args) {

    }
    public static void run() /*throws IOException*/ {

        try {
            File logFile = new File("api/homework/homework2/calculatorWithLog/log.txt");
            FileWriter fileWriter = new FileWriter(logFile, true);

            try {
                
                System.out.println("Введите первое число:");
                double a = scann.nextInt();
                System.out.println("Введите операцию: '-','+','*','/'.");
                char act = scann.next().charAt(0);
                System.out.println("Введите второе число:");
                double b = scann.nextInt();

                switch (act){
                    case '-':
                        fileWriter.write(a + " - " + b + " = " + subtraction(a, b)+ "\n");
                        break;
                    case '+':
                        fileWriter.write(a + " + " + b + " = " + addition(a, b)+ "\n");
                        break;
                    case '*':
                        fileWriter.write(a + " + " + b + " = " + multiplic(a, b)+ "\n");
                        break;
                    case '/':
                        fileWriter.write(a + " / " + b + " = " + division(a, b)+ "\n");
                        break;
                    default:
                        fileWriter.write("Неверная операция\n");
            }

            } catch (InputMismatchException ex) {
                System.out.println(ex + " - Неправильные пчелы вводят не правильные числа.");
                fileWriter.write((ex + " - Неправильные пчелы вводят не правильные числа.\n"));
            }
            
            
            fileWriter.close();
            
        } 
        catch (IOException ex) {
            System.out.println(ex + " - Что то не то:(");
            //fileWriter.write(ex + " - Что то не то:(");
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
