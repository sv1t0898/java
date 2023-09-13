package exc.homework.homework3;

import exc.homework.homework3.myException.DateException;
import exc.homework.homework3.myException.MyException;

public class Program{

    public static void main(String[] args) throws MyException {
        DataRequest dataRequest1 = new DataRequest("Фамилия Имя Отчество 0.12.2002 432432432 4");
        DataRequest dataRequest2 = new DataRequest("Фамилия Имя Отчество 24.0.2002 432432432 f");
        DataRequest dataRequest3 = new DataRequest("Фамилия Имя Отчество 19.12.2022 432432432 m");
        DataRequest dataRequest4 = new DataRequest("Фамилия Имя 3453 Отчество 19.12.2022 432432432 m");
        //System.out.println(dataRequest.getBirthday());
    }
}
