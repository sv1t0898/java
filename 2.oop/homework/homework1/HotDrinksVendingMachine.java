package oop.homework.homework1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine{

    List<HotDrink> listHotDrink = new ArrayList();

    public void addHotDrink(HotDrink hotDrink){
        listHotDrink.add(hotDrink);
    }

    @Override
    public Object getProduct(String name, int volume, int temperature){
        for (int i = 0; i < listHotDrink.size(); i++){
            if (listHotDrink.get(i).getName().equals(name) && listHotDrink.get(i).getVolume() == volume &&
                    listHotDrink.get(i).getTemp() == temperature) {
                return listHotDrink.remove(i);
            }
        }
        return "Торговый авомат пуст или в нем нет данного напитка";
    }

    @Override
    public String toString() {
        return "HotDrinksVendingMachine{" +
                "listHotDrink=" + listHotDrink +
                '}';
    }
}
