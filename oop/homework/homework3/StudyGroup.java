package oop.homework.homework3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterator<Student> {

    //private int groupId;
    private List<Student> studentGroup;
    private int index;

//    public int getGroupId() {
//        return groupId;
//    }

    public List<Student> getStudentGroup() {
        return studentGroup;

    }

    public void setStudentGroup(List<Student> studentGroup) {
        this.studentGroup = studentGroup;
    }

    public StudyGroup(){
        studentGroup = new ArrayList<>();
        index = -1;
    }
    public StudyGroup(List<Student> studentList){
        setStudentGroup(studentList);
    }
    public void addStudent(Student student){
        studentGroup.add(student);
    }

    @Override
    public String toString(){
        return getStudentGroup().toString();
    }


    @Override
    public boolean hasNext() {
        return index < studentGroup.size() - 1;
    }

    @Override
    public Student next() {
        if (! hasNext()){
            return null;
        }
        index++;
        return studentGroup.get(index);
    }
}

