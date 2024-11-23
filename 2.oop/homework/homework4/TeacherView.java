package oop.homework.homework4;

import java.util.List;

public class TeacherView implements UserView<Teacher>{

    @Override
    public void userView(List<Teacher> teachers) {
        for(Teacher teacher: teachers){
            System.out.println(teacher.toString());
        }
    }
}
