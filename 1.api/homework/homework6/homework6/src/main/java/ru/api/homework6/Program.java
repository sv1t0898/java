package api.homework.homework6.homework6.src.main.java.ru.api.homework6;

import java.util.HashSet;

public class Program {



    public static void main(String[] args) {

        HashSet<Cat> hashSet = new HashSet<>();
        hashSet.add(new Cat());
        hashSet.add(new Cat());
        hashSet.add(new Cat(34, "Уголек", "Черный"));
        hashSet.add(new Cat(33, "Уголек", "Черный"));
        hashSet.add(new Cat());
        System.out.println("Сравним два экземпляра класса Cat с разными полями - " + new Cat(34, "Уголек", "Черный").equals(new Cat()));
        System.out.println("Сравним два экземпляра класса Cat с одинаковыми полями - " + new Cat().equals(new Cat()));
        System.out.println(hashSet.hashCode());
        System.out.println(hashSet);
    }


//        Задание
//        1.Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
//        2.Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество.
//        3.Создайте метод
//        public boolean equals(Object o) Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true,
//        только если значения во всех полях сравниваемых объектов равны.
//        1.Создайте метод
//        public int hashCode() который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
//        1.Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.


}
