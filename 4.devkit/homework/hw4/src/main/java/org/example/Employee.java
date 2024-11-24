package org.example;

public class Employee {

    private int personnelNumber;
    private int phoneNumber;
    private String nane;
    private int experience;

    public Employee(int personnelNumber, int phoneNumber,
                    String nane, int experience) {
        this.personnelNumber = personnelNumber;
        this.phoneNumber = phoneNumber;
        this.nane = nane;
        this.experience = experience;

    }

    public void setPersonnelNumber(int personnelNumber) {
        this.personnelNumber = personnelNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setNane(String nane) {
        this.nane = nane;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getNane() {
        return nane;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "personnelNumber:" + personnelNumber + " phoneNumber:" + phoneNumber + " name:" +
        nane + " experience:" + experience;
    }
}
