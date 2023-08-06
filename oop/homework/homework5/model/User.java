package oop.homework.homework5.model;

abstract class User {
    private String firstName;
    private String surName;

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
    public User(){
        this(null, null);
    }
    public User(String firstName, String surName){
        this.firstName = firstName;
        this.surName = surName;
    }
}
