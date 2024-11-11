package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Random;
@Setter
@Getter

public class Doors {

    @Setter
    private int selectedDoor;
    @Setter
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

    @Override
    public  String toString(){
        return Arrays.toString(doors);
    }
}
