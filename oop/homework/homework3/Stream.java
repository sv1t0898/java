package oop.homework.homework3;

import java.util.*;

public class Stream implements Iterable<StudyGroup> {


    private List<StudyGroup> studyGroups;

    public List<StudyGroup> getStudyGroups() {
        return studyGroups;
    }

    public void setStudyGroups(List<StudyGroup> studyGroups) {
        this.studyGroups = studyGroups;
    }
    public Stream(){
        studyGroups = new ArrayList<StudyGroup>();
    }
    public Stream(List<StudyGroup> studyGroupList){
        setStudyGroups(studyGroupList);

    }
    public void addGroup(StudyGroup studyGroup){
        studyGroups.add(studyGroup);
    }

    public int size(){
        return studyGroups.size();
    }


    @Override
    public int hashCode() {
        return Objects.hash(studyGroups);
    }

    @Override
    public String toString(){
        return getStudyGroups().toString();
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return studyGroups.iterator();
    }
}
