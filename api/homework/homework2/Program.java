package api.homework.homework2;

import java.util.Scanner;

import api.homework.homework2.calculatorWithLog.Calculator;

public class Program {

    static String filter = "\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"";
    static String select = "\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Tula\", \"age\":\"12\", \"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\", \"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"34\"";


    static Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {

        //BubbleSort.run(mytools.randomArray(15));
        //StringBuilder respons = Selection.formResponsSqlWrite(select, filter);
        //System.out.println(respons);
        Calculator.run();

        
    }
    

// 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE
// этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} 

    //Selection.run();
    

// 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой
// итерации запишите в лог-файл.

    //BubbleSort.run(mytools.randomArray(15));
    

// 3) Дана json-строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.


// 4) К калькулятору из предыдущего ДЗ добавить логирование.

    //Calculator.run();

    
}
