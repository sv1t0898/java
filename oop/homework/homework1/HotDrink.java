package oop.homework.homework1;

import static java.lang.String.format;

public class HotDrink extends Drink{

    private int temperature;

    public int getTemp(){
        return temperature;
    }
    public void setTemp(int temp){
        this.temperature = temp;
    }

    public HotDrink(){
    }

    public HotDrink (String name, int volume, int temperature){
        super.setName(name);
        super.setVolume(volume);
        setTemp(temperature);

    }

    @Override
    public String toString() {
        return format("%s, %d, %d", super.getName(), super.getVolume(), temperature);
    }
}
