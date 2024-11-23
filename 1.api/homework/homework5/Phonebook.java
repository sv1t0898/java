package api.homework.homework5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Phonebook {

    static HashMap<String, List<String>> hashMap = new HashMap<>();

    public Phonebook(){};

    public Phonebook(String[] str){

        for (String parts : str){
            String[] part = parts.split(" ");
            this.add(part[1], part[0]);
        }
    }

    public void add(String number, String surName){
        if (hashMap.containsKey(surName)){
            hashMap.get(surName).add(number);
        }
        else{
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(number);
            hashMap.put(surName, numbers);
        }

    }
    public String get(String surName){
        try {
            return hashMap.get(surName).toString();
        }
        catch (NullPointerException e){
            return "Абонент отсутствует, %" + e;
        }
    }


}
