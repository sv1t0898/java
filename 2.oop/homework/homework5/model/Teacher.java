package oop.homework.homework5.model;

import static java.lang.String.format;

public class Teacher extends User{

    private int teacherId = 0;

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    public Teacher(){
        this(null, null, 0);
    }
    public Teacher(String firstName, String surName, int teacherId){
        super(firstName, surName);
        this.teacherId = teacherId;
    }
    @Override
    public String toString(){
        return format("%d,%s,%s.", this.teacherId, getFirstName(), getSurName());
    }

}
