package api.homework.homework5;

import java.util.Scanner;

public class Program {

    static Scanner scanner = new Scanner(System.in);

    static String[] subscriber = {
            "Григорьев 89459397543",
            "Афанасьев 35830603064",
            "Шестаков 5039629525",
            "Соколов 86040305920",
            "Шубин 85839520456",
            "Лыткина 95929802524",
            "Брагина 6780336832",
            "Афанасьев 859392494939",
            "Рыбакова 75729384724",
            "Лыткин 45929446753",
            "Бирюков 86488593924",
            "Копылов 85482094541",
            "Горбунов 75953950395",
            "Лыткина 79987204854",
            "Соколов 12374794987",

    };

    static Phonebook simplePhonebook = new Phonebook(subscriber);

    public static void main(String[] args) {

        //inOutPhonebook(simplePhonebook);
        System.out.println("Запросим абонента \"Афанасьев\"");
        System.out.println(simplePhonebook.get("Афанасьев"));
        System.out.println("Запросим абонента когорого нет в справочнике");
        System.out.println(simplePhonebook.get("Иванов"));
        System.out.println("Добавим абонента \"Афанасьев\" с номером \"12345\"");
        simplePhonebook.add("12345", "Афанасьев");
        System.out.println(simplePhonebook.get("Афанасьев"));

    }

//    Задание
//
//    Написать простой класс Телефонный Справочник (с помощью HashMap), который хранит в себе список фамилий
//    и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи,
//    а с помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может
//    быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.

    public static void inOutPhonebook(Phonebook phonebook){
        while(true){
            System.out.println("Введите фамилию и номер телефона через пробел, \"Фамилия номер\" " +
                    "для добавления элемента\nили введите get и через пробел фамилию \"get Фамилия\", для получения номера:");
            String inputData = scanner.nextLine();
            if (inputData.isEmpty()){
                System.out.println("Заполнение справочника завершено.");
                break;
            }

            String parts[] = inputData.split(" ");
            if (parts[0].equals("get")){
                System.out.println(phonebook.get(parts[1]));
            }
            else{
                phonebook.add(parts[1], parts[0]);}

        }

    }

}
