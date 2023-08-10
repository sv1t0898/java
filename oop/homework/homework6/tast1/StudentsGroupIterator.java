package oop.homework.homework6.tast1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentsGroupIterator implements Iterator<Student> {

    private List<Student> studentsGroup;
    private int coutnter;

    public StudentsGroupIterator(StudentGroup studentGroup){
        this.studentsGroup = studentGroup.getStudents();
        this.coutnter = 0;
    }

    @Override
    public boolean hasNext() {

        return coutnter < studentsGroup.size() - 1;
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        coutnter++;
        return studentsGroup.get(coutnter);
    }

    @Override
    public void remove(){
        studentsGroup = new ArrayList<Student>();
        coutnter = 0;
        }

}
