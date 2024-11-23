package oop.homework.homework5.model;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> studentList;

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    public StudyGroup(){
        this(null, new ArrayList<Student>());
    }
    public StudyGroup(Teacher teacher, List<Student> studentList){
        setTeacher(teacher);
        setStudentList(studentList);
    }
    @Override
    public String toString(){
        return format("%s:\n %s", getTeacher(), getStudentList());
    }
}
