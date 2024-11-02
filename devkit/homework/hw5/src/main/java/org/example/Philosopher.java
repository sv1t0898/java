package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Philosopher extends Thread{

    private static int quantity;
    private int id;

    private boolean handLeft;
    private boolean handRight;
    private int countHunger;
    private String name;
    CountDownLatch сounterFood;
    Control control;


    public Philosopher(int countHunger, String name, CountDownLatch counterFood, Control control){
        id = (quantity++);
        control.setCoutnForks(quantity);
        this.control= control;
        this.countHunger = countHunger;
        this.name = name;
        this.сounterFood = counterFood;
    }

    public void setHandLeft(boolean handLeft) {
        this.handLeft = handLeft;
    }

    public void setHandRight(boolean handRight) {
        this.handRight = handRight;
    }

    @Override
    public void run() {
        System.out.println(Arrays.toString(control.getFork()) + id );
        synchronized (control) {            // ??????????
            eat();
        }
        System.out.println(Arrays.toString(control.getFork()) + id + handLeft + handRight + "\n");

    }

    private void eat(){
        try {
            while (countHunger > 0 ) {
                setHandLeft(control.takeFork(id));
                setHandRight(control.takeFork(id + 1));
                if (handLeft && handRight) {
                    System.out.printf("Филосов %s берет вилки.\n", name);
                    System.out.printf("%s.Филосов %s кушает.\n", id, name);
                    Thread.sleep(new Random().nextInt(2, 5) * 1000L);
                    countHunger--;
                    сounterFood.countDown();
                    setHandLeft(control.putFork(id));
                    setHandRight(control.putFork(id + 1));
                    System.out.printf("Филосов %s вернул вилки.\n", name);

                    System.out.printf("Филосов %s размышляет...\n", name);
                    Thread.sleep(new Random().nextInt(2, 7) * 1000L);
                } else {
                    //System.out.printf("Филосов %s размышляет...\n", name);
                    //System.out.printf("Филосов %s наелся... размышляет...\n", name);
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
