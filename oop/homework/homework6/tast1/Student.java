package oop.homework.homework6.tast1;

import static java.lang.String.format;

public class Student extends User implements Comparable<Student>{
/*
*   ___3.LSP___
*   Собллюдается принцип LSP, поведение методов у дочернего класа,
*   относительно родетельского не изменено, в случае downcast User к Student, програма будет работать.
*
*   ___2.OSP___
*   Так же соблюдается принцип OSP класс Student расширяет(наследует) родительский класс User,
*   и нам не приходится прибегать к модификации класса User.
* */

    private Integer numbersOfStudent;
//    public Student(){
//
//    };

    public Student(Integer numbersOfStudent, String firstName, String secondName, String lastName){
        super(firstName, secondName, lastName);
        this.setNumbersOfStudent(numbersOfStudent);

    }

    public int getNumbersOfStudent(){
        return this.numbersOfStudent;
    }
    public void setNumbersOfStudent(Integer numbersOfStudent){
        this.numbersOfStudent = numbersOfStudent;
    }

    @Override
    public boolean equals(Object student){
        if (this == student){
            return true;
        }
        Student stu = (Student) student;
        return (this.getFirstName().equals(stu.getFirstName()) &&
                this.getSecondName().equals(stu.getSecondName()) &&
                this.getLastName().equals(stu.getLastName()));
    }

    @Override
    public String toString(){
        return format("numbersOfStudent - %d, %s - firstName, %s - secondName, %s - lastName",
                numbersOfStudent, getFirstName(), getSecondName(), getLastName());

    }

    @Override
    public int compareTo(Student o) {
        if (this.numbersOfStudent > o.numbersOfStudent){return 1;}
        else if (this.numbersOfStudent < o.numbersOfStudent){return -1;}
        else{return 0;}

    }
}
