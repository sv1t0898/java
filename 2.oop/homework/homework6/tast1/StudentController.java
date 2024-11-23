package oop.homework.homework6.tast1;

import java.time.LocalDate;

public class StudentController implements UserController<Student>{

    private StudentGroupService studentGroupService = new StudentGroupService();

    public static void main(String[] args) {
        Student student1 = new Student(14, "Иванов", "Иван", "Иванович");
        Student student2 = new Student(15, "Пертов", "Иван", "Иванович");
        Student student3 = new Student(12, "Сидоров", "Иван", "Иванович");
        Student student4 = new Student(16, "Луков", "Иван", "Иванович");
        Student student5 = new Student(13, "Любин", "Иван", "Иванович");
        Student student6 = new Student(17, "Губин", "Иван", "Иванович");

        StudentGroup studentGroup = new StudentGroup();
        studentGroup.add(student1);
        studentGroup.add(student2);
        studentGroup.add(student3);
        studentGroup.add(student4);
        studentGroup.add(student5);
        studentGroup.add(student6);

        StudentGroupService studentGroupService1 = new StudentGroupService();
        studentGroupService1.setStudentGroup(studentGroup);

        System.out.println(studentGroup);
        System.out.println();

        studentGroupService1.removeStudent("Иванов", "Иван", "Иванович");

        System.out.println(studentGroup);

        StudentGroupService studentGroupService2 = new StudentGroupService(studentGroup);

        studentGroupService2.sortToId();
        System.out.println();
        System.out.println(studentGroup);

        studentGroupService2.sortToString();
        System.out.println();
        System.out.println(studentGroup);


    }


    @Override
    public void craeter(String firstName, String surName, String lastName) {
        User newUser = new User(firstName, lastName, surName);
    }

    public void printConlose(){
          
    }
}
