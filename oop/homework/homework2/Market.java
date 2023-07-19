package oop.homework.homework2;

import javax.naming.PartialResultException;
import java.lang.reflect.Array;
import java.util.*;

public class Market implements MarketBehaviour, QueueBehaviour{

    LinkedList<Human> makingOrder;
    HashMap<Integer, Human> waitingOrder;
    private int numOrder;

    {
        numOrder = 0;
    }
    public Market(){
        this.makingOrder = new LinkedList<>();
        this.waitingOrder = new HashMap<>();
    }
    @Override
    public void addHumanQueue(Human human) {
        this.makingOrder.add(human);
        System.out.printf("Посетитель - %s встал в очередь.\n",human.getName());


    }

    @Override
    public Human delHumanQueue() {
        return makingOrder.pollFirst();
    }

    @Override
    public void update() {
         humanMakingOrder();
         humanReceivedOrder();
    }

    @Override
    public void humanMakingOrder() {
        Human makeOrder = delHumanQueue();
        if (makeOrder != null){
            makeOrder.setNumOrder(numberOrder());
            waitingOrder.put(makeOrder.getNumOrder(), makeOrder);
            System.out.printf("Посетитель - %s сделал заказ, номер заказа - %d. -> ", makeOrder.getName(), makeOrder.getNumOrder());
            System.out.printf("Стек ожидания заказов %s.\n", waitingOrder.keySet());
        }
    }


    @Override
    // заказы могут выдваться по мере готовности а не поочереди т.к. разное время готовности.
    public void humanReceivedOrder() {
        Integer[] numbersOrder = waitingOrder.keySet().toArray(new Integer[0]);
        System.out.printf("Посетитель - %s получил свой заказ.\n", waitingOrder.get(numbersOrder[0]).getName());
        waitingOrder.remove(numbersOrder[0]);
    }

    public int numberOrder(){
        return numOrder++;
    }
}
