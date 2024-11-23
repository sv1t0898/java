package oop.homework.homework4;

public class Teacher extends User{

    private int teacherId;

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public Teacher(){
        this(null, null);
    }
    public Teacher(String firstName, String surName){
        super.setFirstName(firstName);
        super.setSurName(surName);
    }

    @Override
    public String toString() {
        return getTeacherId() + ", " + getSurName() + ", " + getFirstName();
    }
}
