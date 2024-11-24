package oop.homework.homework2;

public class Program {
    public static void main(String[] args) {

        Market market1 = new Market();

        market1.addHumanQueue(new Human("Покупатель_1"));
        market1.addHumanQueue(new Human("Покупатель_2"));
        market1.addHumanQueue(new Human("Покупатель_3"));
        market1.addHumanQueue(new Human("Покупатель_4"));
        market1.addHumanQueue(new Human("Покупатель_5"));
        market1.addHumanQueue(new Human("Покупатель_6"));
        market1.addHumanQueue(new Human("Покупатель_7"));
        market1.addHumanQueue(new Human("Покупатель_8"));

        market1.update();
        market1.update();
        market1.update();
        market1.update();


    }

//    Реализовать класс Market и все методы, которые он обязан реализовывать.
//    Методы из интерфейса QueueBehaviour, имитируют работу очереди, MarketBehaviour – помещает и удаляет человека из очереди,
//    метод update – обновляет состояние магазина (принимает и отдаёт заказы)
//    Формат сдачи: ссылка на гитхаб проект
}
