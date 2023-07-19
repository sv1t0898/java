package oop.homework.homework1;

public abstract class Drink {

    private String name;
    private Double price;
    private int volume;

    public String getName() {

        return name;
    }
    public Double getPrice(){

        return price;
    }
    public int getVolume(){
        return volume;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setPrice(Double price){

        this.price = price;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }

    public Drink(){
        this("someDrink", 5.0, 0);
    }

    public Drink(String name, Double price, int volume){
        setName(name);
        setPrice(price);
        setVolume(volume);
    }

}
