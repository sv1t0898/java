package oop.homework.homework3;

import static java.lang.String.format;

public class Student {

    private int studentId;
    private String firstName;
    private String secondName;

    public int getStudentId() {
        return studentId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getSecondName(){
        return secondName;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Student(){}

    public Student(int studentId, String firstName, String secondName){
        setStudentId(studentId);
        setFirstName(firstName);
        setSecondName(secondName);
    }
    @Override
    public String toString(){
        return format("studentId - %d; firstName - %s, secondName - %s",studentId, firstName, secondName);
    }
}
