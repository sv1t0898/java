package exc.homework.homework3;

import exc.homework.homework3.myException.DataInputException;
import exc.homework.homework3.myException.DateException;
import exc.homework.homework3.myException.GenderException;
import exc.homework.homework3.myException.MyException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class DataRequest {

    String data[];
    String name;
    String surName;
    String lastName;
    String birthday;            //format dd.mm.yyyy
    String phoneNumber;
    String gender;             // 1 - man; 0 - woman;

    public String getBirthday(){
        return birthday;

    }
    public void setData(String data) throws DataInputException {
        if (data.split(" ").length != 6){
            throw new DataInputException("Несоответствие количества введенных данных.");
        }else{
            this.data = data.split(" ");
        }
    }
    public void setBirthday(String birthday) throws DateException{
        String[] parsBirthday = birthday.split("\\.");
        if (parsBirthday.length != 3){
            throw new DateException("Неверный формат даты.");
        }else if (Integer.parseInt(parsBirthday[0]) < 1 | Integer.parseInt(parsBirthday[0]) > 31 ){
            throw new DateException("Неверный формат даты. Неправильное число.");
        }else if(Integer.parseInt(parsBirthday[1]) < 1 | Integer.parseInt(parsBirthday[1]) > 12 ){
            throw new DateException("Неверный формат даты. Месяц введен не верно.");
        }else if(Integer.parseInt(parsBirthday[2]) < 1970 | Integer.parseInt(parsBirthday[2]) > 2010){
            throw new DateException("Неверный формат даты. Год введен не верно");
        }else{
            this.birthday = birthday;
        }
    }
    public void setGender(String gender)throws GenderException {
        if (!(Objects.equals(gender, "f") | Objects.equals(gender, "m"))){
            throw new GenderException("Неверные формат ввода пола.");
        }else{
            this.gender = gender;
        }
    }

    public DataRequest(String data) throws MyException {
        try {
            this.setData(data);
            this.surName = this.data[0];
            this.name = this.data[1];
            this.lastName = this.data[2];
            this.phoneNumber = this.data[4];
            try{
                this.setBirthday(this.data[3]);
            }catch (MyException me){
                System.out.println(me.getClass() + ":"+ me.getMessage());
            }
            try{
                this.setGender(this.data[5]);
            }catch (MyException me){
                System.out.println(me.getClass() + ":"+ me.getMessage());
            }
        }
        catch (MyException me){
            System.out.println(me.getClass() + ":"+ me.getMessage());
        }



    }


}


