package oop.homework.homework6.tast1;

import java.util.List;

public class StudentView implements UserView<Student>{
    @Override
    public void sendOnConsole(List<Student> student) {
        for (Student student1: student){
            System.out.println(student1.getNumbersOfStudent());
        }

    }
}
