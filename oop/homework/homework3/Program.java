package oop.homework.homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {

        Student student1 = new Student(1,"q","w");
        Student student2 = new Student(2,"q","w");
        Student student3 = new Student(3,"q","w");
        Student student4 = new Student(4,"q","w");
        Student student5 = new Student(5,"q","w");
        Student student6 = new Student(6,"q","w");
        Student student7 = new Student(7,"q","w");
        Student student8 = new Student(8,"q","w");
        Student student9 = new Student(9,"q","w");

        StudyGroup studyGroup1 = new StudyGroup();
        studyGroup1.addStudent(student1);
        studyGroup1.addStudent(student4);
        studyGroup1.addStudent(student7);
        StudyGroup studyGroup2 = new StudyGroup();
        studyGroup2.addStudent(student2);
        studyGroup2.addStudent(student5);
        studyGroup2.addStudent(student6);
        StudyGroup studyGroup3 = new StudyGroup();
        studyGroup3.addStudent(student3);
        studyGroup3.addStudent(student8);
        studyGroup3.addStudent(student9);

//        while(studyGroup1.hasNext()){
//            System.out.println(studyGroup1.next());
//        }
//        System.out.println(studyGroup1);
//        while(studyGroup2.hasNext()){
//            System.out.println(studyGroup2.next());
//        }
//        System.out.println(studyGroup2);
//        while(studyGroup3.hasNext()){
//            System.out.println(studyGroup3.next());
//        }
//        System.out.println(studyGroup3);

        System.out.println("Создать класс Stream, содержащий в себе список StudyGroups и реализующий интерфейс Iterable;");
        Stream stream1 = new Stream();
        stream1.addGroup(studyGroup1);
        stream1.addGroup(studyGroup3);
        stream1.addGroup(studyGroup2);
        stream1.addGroup(studyGroup3);


//        while(stream1.iterator().hasNext()){
//            System.out.println(stream1.iterator().next());
//        }
        System.out.println("Итерация \"Stream1\"");
        for (StudyGroup o: stream1) {
            System.out.println(o);
        }

        Stream stream2 = new Stream();
        stream2.addGroup(studyGroup2);
        stream2.addGroup(studyGroup1);
        stream2.addGroup(studyGroup3);
        stream2.addGroup(studyGroup2);
        stream2.addGroup(studyGroup2);

        System.out.println();

        System.out.println("Итерация \"Stream2\"");
        for (StudyGroup group: stream2){
            System.out.println(group);
        }
        System.out.println();

        System.out.println("Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Stream;");
        StreamComparator compareSizeGroup = new StreamComparator();
        switch (compareSizeGroup.compare(stream1, stream2)) {
            case 1 :
                System.out.println("stream1 больше.");
                break;
            case -1 :
                System.out.println("stream2 больше.");
                break;
            case 0 :
                System.out.println("Группы равны.");
                break;
        }
        System.out.println();

        System.out.println("Создать класс StreamService, добавив в него метод сортировки списка Streams, используя созданный StreamComparator.");

        Stream stream3 = new Stream();
        stream3.addGroup(studyGroup3);
        stream3.addGroup(studyGroup1);
        stream3.addGroup(studyGroup2);

        StreamService streamService = new StreamService();
        streamService.addStream(stream1);
        streamService.addStream(stream2);
        streamService.addStream(stream3);

        System.out.println("Итерация списка групп до сортировки:");
        int i = 1;
        for(Stream stream: streamService){
            System.out.printf("Группа - %d: %s\n", i,stream);
            i++;
        }
        streamService.sortStreams();
        System.out.println();
        System.out.println("Итерация списка групп после сортировки:");
        i = 1;
        for(Stream stream: streamService){
            System.out.printf("Группа - %d: %s\n", i,stream);
            i++;
        }

    }

    /**
     * — Создать класс Stream, содержащий в себе список StudyGroups и реализующий интерфейс Iterable;
     * — Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Stream;
     * — Создать класс StreamService, добавив в него метод сортировки списка Streams, используя созданный StreamComparator;
     * — Модифицировать класс  Controller, добавив в него созданный сервис;
     * — Модифицировать класс Controller, добавив в него метод, сортирующий список потоков, путём вызова созданного сервиса.
     */
}
