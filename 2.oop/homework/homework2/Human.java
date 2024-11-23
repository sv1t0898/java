package oop.homework.homework2;

public class Human {

    private String name;

    private int numberOrder;

    public String getName(){
        return this.name;
    }
    public int getNumOrder(){
        return this.numberOrder;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNumOrder(int numberOrder){
        this.numberOrder = numberOrder;
    }
    public Human(String name){
        setName(name);
    }



}
