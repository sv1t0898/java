package org.example;

import java.util.Arrays;
import java.util.Random;

public class Doors {

    private int selectedDoor;
    private int openedDoor = -1;
    private final int winningDoor;
    private final Boolean[] doors = new Boolean[3];

    public Doors(){
        this.winningDoor = new Random().nextInt(doors.length);
        doors[winningDoor] = true;
        for (int i = 0; i < doors.length; i++){
            if (doors[i] == null){
                    doors[i] = false;
                }
        }
    }

    public Boolean[] getDoors(){
        return doors;
    }

    public int getWinningDoor() {
        return winningDoor;
    }

    public int getOpenedDoor(){
        return openedDoor;
    }

    public void setOpenedDoor(int openedDoor) {
        this.openedDoor = openedDoor;
    }

    public int getSelectedDoor() {
        return selectedDoor;
    }

    public void setSelectedDoor(int selectedDoor) {
        this.selectedDoor = selectedDoor;
    }

    @Override
    public  String toString(){
        return Arrays.toString(doors);
    }
}
