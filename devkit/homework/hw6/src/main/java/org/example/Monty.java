package org.example;

public class Monty{

    private Doors doors;

    public Monty(Doors doors){
        this.doors = doors;
    }

    public void montyOpensDoor(){
        for (int i = 0; i < doors.getDoors().length; i++){
            if (i != doors.getWinningDoor() &&
                    i != doors.getSelectedDoor() && i != doors.getOpenedDoor()){
                doors.setOpenedDoor(i);
            }
        }
    }

}
