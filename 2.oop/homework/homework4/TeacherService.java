package oop.homework.homework4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TeacherService<T extends Teacher> {

    private List<T> teachers;

    private int counterIdTeacher = 0;

    public List<T> getTeacher() {
        return teachers;
    }

    private void setTeachers(List<T> teachers){
        this.teachers = teachers;
    }

    public TeacherService(){
        teachers = new LinkedList<T>();
    }
    public TeacherService(List<T> teachers){
        setTeachers(teachers);
    }

    public void addTeacher(T teacher){
        teacher.setTeacherId(counterIdTeacher);
        teachers.add(teacher);
        counterIdTeacher ++;
    }

    public void editTeacher(int teacherId, String firstName, String surName){
        teachers.remove(teacherId);
        Teacher teacher = new Teacher(firstName, surName);
        teacher.setTeacherId(teacherId);
        teachers.add(teacherId, (T) teacher);
    }




    @Override
    public String toString() {
        return "TeacherService{" +
                "Teacher=" + teachers +
                '}';
    }
}
