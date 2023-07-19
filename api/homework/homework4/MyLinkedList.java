package api.homework.homework4;

import java.util.LinkedList;

public class MyLinkedList extends LinkedList {

    //private static LinkedList linkedList = new LinkedList();

    public MyLinkedList() {
    }

    public void enqueue(String elment){
        this.add(0, elment);

    }
    public String dequeue(){
        System.out.println(this.get(this.size() -1));
        this.remove(this.size()-1);
        //return result;


        return null;
    }
    public void first(){
        System.out.println(this.get(this.size() -1));
    }


}




