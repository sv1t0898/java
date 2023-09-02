package oop.homework.homework7;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DataPreparation {

    private String[] date;

    public String[] getDate() {
        return date;
    }
    private void setDate(String[] date){
        this.date = date;
    }

    public DataPreparation(String inputDate){
        this.preparation(inputDate);
    }

    public void preparation(String inputDate){
        String[] input = inputDate.replaceAll("[^i0-9/+*-]","").split(""); // будем времмено отбрасывать скобка ()
        String result = "";
        String num = new String("1234567890i");
        for (String string: input){
            if (num.contains(string)){
                result += string;
            }
            else {
                result += " " + string + " ";
            }
        }
        setDate(result.split(" "));

    }


}
