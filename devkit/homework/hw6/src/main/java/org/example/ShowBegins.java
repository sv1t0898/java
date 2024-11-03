package org.example;

import java.util.Random;

public class ShowBegins {

    private static final Random rand = new Random();
    Statistics statistics;

    public ShowBegins() {
        statistics = new Statistics();

    }

    public void begins(){
        Doors doors = new Doors();
        System.out.println(doors);
        Monty monty = new Monty(doors);
        Player player = new Player(doors);
        System.out.printf("Игрок выбрал дверь %s.\n", doors.getSelectedDoor()+1);
        monty.montyOpensDoor();
        System.out.printf("Монти выпустил козу из %s двери,\nи предлагает игроку изменить выбор.\n", doors.getOpenedDoor()+1);
        if(rand.nextBoolean()) {
            System.out.printf("Игрок решил поменять дверь с %s на " , doors.getSelectedDoor()+1);
            player.selectedDoor();
            System.out.printf("%s.\n" , doors.getSelectedDoor()+1);
        }else{
            System.out.println("Игрок решил не менять выбор.");
        }
        System.out.printf(doors.getDoors()[doors.getSelectedDoor()] ? "Поздравим игрока он победил!!!!!\n" : "Эх...неудача.\n");
        statistics.addResult(String.valueOf(doors.getDoors()[doors.getSelectedDoor()]));
    }

    public String getStatistics(){
        System.out.println(statistics);
        return statistics.toString();
    }
}
