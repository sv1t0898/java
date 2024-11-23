package oop.homework.homework4;

public class TeacherController {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("name1", "surName1");
        Teacher teacher2 = new Teacher("name2", "surName2");
        Teacher teacher3 = new Teacher("name3", "surName3");
        Teacher teacher4 = new Teacher("name4", "surName4");
        Teacher teacher5 = new Teacher("name5", "surName5");
        Teacher teacher6 = new Teacher("name6", "surName6");

        TeacherService<Teacher> teacherService = new TeacherService<>();
        teacherService.addTeacher(teacher1);
        teacherService.addTeacher(teacher2);
        teacherService.addTeacher(teacher3);
        teacherService.addTeacher(teacher4);
        teacherService.addTeacher(teacher5);
        teacherService.addTeacher(teacher6);

        new TeacherView().userView(teacherService.getTeacher());
        System.out.println();

        teacherService.editTeacher(4, "Иван", "Васильевич");

        new TeacherView().userView(teacherService.getTeacher());
    }
}
