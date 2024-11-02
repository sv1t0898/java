package org.example;

import java.util.*;
import java.util.concurrent.CountDownLatch;

public class Table extends Thread{

    CountDownLatch сounterFood;
    List<Philosopher> philosophers = new LinkedList<>();
    Control control;

    public Table(){
        control = new Control();
        сounterFood = new CountDownLatch(5);
        philosophers.add(new Philosopher(3, "Вася", сounterFood, control));
        philosophers.add(new Philosopher(3, "Петя", сounterFood, control));
        philosophers.add(new Philosopher(3, "Коля", сounterFood, control));
        philosophers.add(new Philosopher(3, "Дима", сounterFood, control));
        philosophers.add(new Philosopher(3, "Юра", сounterFood, control));
    }

    @Override
    public void run() {
        try {
            for (Philosopher philosopher : philosophers) {
                philosopher.start();
            }
//            wait();
//            for (Philosopher philosopher : philosophers) {
//                philosopher.start();
//            }
//            wait();
//            for (Philosopher philosopher : philosophers) {
//                philosopher.start();
//            }

            сounterFood.await();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
