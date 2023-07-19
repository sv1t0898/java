package oop.homework.homework1;

public class Program {
    public static void main(String[] args) {

        HotDrinksVendingMachine hotDrinksVendingMachine = new HotDrinksVendingMachine();

        HotDrink hotDrink1 = new HotDrink("drink1", 23, 30);
        HotDrink hotDrink2 = new HotDrink("drink2", 23, 30);
        HotDrink hotDrink3 = new HotDrink("drink3", 23, 35);
        HotDrink hotDrink4 = new HotDrink("drink4", 50, 35);
        HotDrink hotDrink5 = new HotDrink("drink5", 50, 35);
        HotDrink hotDrink6 = new HotDrink("drink6", 50, 30);
        HotDrink hotDrink7 = new HotDrink("drink6", 250, 30);

        hotDrinksVendingMachine.addHotDrink(hotDrink1);
        hotDrinksVendingMachine.addHotDrink(hotDrink2);
        hotDrinksVendingMachine.addHotDrink(hotDrink3);
        hotDrinksVendingMachine.addHotDrink(hotDrink4);
        hotDrinksVendingMachine.addHotDrink(hotDrink5);
        hotDrinksVendingMachine.addHotDrink(hotDrink6);
        hotDrinksVendingMachine.addHotDrink(hotDrink7);

        System.out.println(hotDrinksVendingMachine.getProduct("drink2", 23, 30));
        System.out.println(hotDrinksVendingMachine);
        System.out.println(hotDrinksVendingMachine.getProduct("drink1", 23, 30));
        System.out.println(hotDrinksVendingMachine);
        System.out.println(hotDrinksVendingMachine.getProduct("drink33", 23, 35));
        System.out.println(hotDrinksVendingMachine);
        System.out.println(hotDrinksVendingMachine.getProduct("drink6", 250, 30));
        System.out.println(hotDrinksVendingMachine);

    }

//    1.Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//    2.Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод
//    getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
//    3.В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
//    4.Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
}
