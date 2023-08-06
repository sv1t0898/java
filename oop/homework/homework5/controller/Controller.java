package oop.homework.homework5.controller;

import oop.homework.homework5.model.Student;
import oop.homework.homework5.model.StudyGroup;
import oop.homework.homework5.model.Teacher;
import oop.homework.homework5.service.StudyGroupService;

import java.util.List;

public class Controller {

    private final StudyGroupService studyGroupService = new StudyGroupService();

    public void create(Teacher teacher, List<Student> studentList){
        studyGroupService.createStudentGroup(teacher, studentList);
    }


}
