package oop.homework.homework6.tast1;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup implements Iterable<Student> {

    private List<Student> students;

    public List<Student> getStudents(){
        return students;
    }
    public void setStudents(List<Student> studentsList){
        this.students = studentsList;
    }

    public StudentGroup(){
        students = new ArrayList<>();
    }
    public StudentGroup(List<Student> studentsList){
        setStudents(studentsList);
    }

    public void add(Student student){
        if (student != null){
            students.add(student);
        }
    }
    public void creatStudent(User user){
        students.add((Student) user);
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                '}';
    }

    @Override
    public StudentsGroupIterator iterator() {
        return new StudentsGroupIterator(this);
    }
}
