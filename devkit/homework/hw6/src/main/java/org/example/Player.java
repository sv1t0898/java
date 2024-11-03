package org.example;

import java.util.Random;

public class Player {

    private final Doors doors;

    public Player(Doors doors) {
        this.doors = doors;
        doors.setSelectedDoor(new Random().nextInt(doors.getDoors().length));
    }

    public void selectedDoor(){
        while(true){
            int i = new Random().nextInt(doors.getDoors().length);
            if (i != doors.getSelectedDoor() && doors.getOpenedDoor() != i){
                doors.setSelectedDoor(i);
                break;
            }
        }
    }


}
