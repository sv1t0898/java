package oop.homework.homework6.tast1;

import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public StudentGroupService(){
        this.studentGroup = new StudentGroup();
    }
    public StudentGroupService(StudentGroup studentGroup){
        setStudentGroup(studentGroup);
    }

    public boolean removeStudent(String firstName, String secondName, String lastName){
        Student remiveStudent = new Student(0, firstName, secondName, lastName);
        if (studentGroup.getStudents() == null) {
            return false;
        }
        List<Student> studentList = studentGroup.getStudents();
        for(Student student: studentList){
            if (student.equals(remiveStudent)){
                studentList.remove(student);
                return true;

            }
        }
        return false;
    }


    /*
    *
    *   ___1.SRP___
    *   В соответствии с принципом SPR стоит создать отдельный клаа SortGroup,
    *   и применять его к сортировки круппы из сервиса.
    *
    * */
    public void sortToId(){
        Collections.sort(this.getStudentGroup().getStudents());
    }

    public void sortToString(){
        Collections.sort(this.getStudentGroup().getStudents(), new UserComparator<Student>());
    }

    public void crateStudent(User user){
        studentGroup.creatStudent(user);
    }
}
