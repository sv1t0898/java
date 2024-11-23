package oop.homework.homework5.model;

import static java.lang.String.format;

public class Student extends User{
    private int studentId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Student(){
        this(null, null, 0);
    }
    public Student(String firstName, String surName, int studentId){
        super(firstName, surName);
        this.studentId = studentId;
    }
    @Override
    public String toString(){
        return format("%d,%s,%s.", studentId, getFirstName(), getSurName());
    }
}
