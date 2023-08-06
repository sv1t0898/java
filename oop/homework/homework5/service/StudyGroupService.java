package oop.homework.homework5.service;

import oop.homework.homework5.model.StudyGroup;
import oop.homework.homework5.model.Student;
import oop.homework.homework5.model.Teacher;

import java.util.List;

public class StudyGroupService{

    public StudyGroup createStudentGroup(Teacher teacher, List<Student> studentList){
        return new StudyGroup(teacher, studentList);
    }
}
