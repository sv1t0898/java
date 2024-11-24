package api.homework.homework4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;


public class program {



    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.enqueue("1");
        myLinkedList.enqueue("2");
        myLinkedList.enqueue("3");
        myLinkedList.enqueue("4");
        myLinkedList.enqueue("5");
        myLinkedList.dequeue();
        myLinkedList.first();

        System.out.println(myLinkedList);

        flippedList();
    }

    //  1. Пусть дан LinkedList с несколькими элементами.
    //  Реализуйте метод, который вернет “перевернутый” список.

    static void flippedList(){

        LinkedList<String> list = new LinkedList<>();
        Deque<String> deque = new ArrayDeque<>();

        for (int i = 0; i < 7; i++){
            list.add("Элемент" + i);
            deque.push(list.get(i));

        }
        System.out.printf("Вариант через \"Deque\". Изначальный список: %s\n", list);

        for (String s: deque){
            list.add(s);
            list.remove(0);
        }
        System.out.printf("Вариант через \"Deque\". Первернутый список: %s\n", list);

    }

//    2 *. Реализуйте очередь с помощью LinkedList со следующими методами:
//    enqueue() - помещает элемент в конец очереди,
//    dequeue() - возвращает первый элемент из очереди и удаляет его,
//    first() - возвращает первый элемент из очереди, не удаляя.
//    Это задание повышенной сложности, для решения задачи потребуется создать класс-обертку над LinkedList, например:
//
//    class MyQueue {
//        private LinkedList elements = new LinkedList();
//        public MyQueue() { }
//        public MyQueue(LinkedList linkedList) {
//            this.elements = linkedList;
//        }
//
//        .........
        //MyLinkedList myLinkedList = new MyLinkedList();


//      3. В калькулятор (урок 1 и 2) добавьте возможность отменить последнюю операцию.




}
