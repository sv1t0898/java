package org.example;

//Задание 1: Создайте класс Person с полями name и age.
// Реализуйте сериализацию и десериализацию этого класса в файл.
//
//Задание 2: Используя JPA, создайте базу данных для хранения объектов класса Person.
// Реализуйте методы для добавления, обновления и удаления объектов Person.



import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person person = new Person("new name 1", 1, "new surname");
        Person person1;
        Person person2;
        Person person3;

        serializ("ser.bin", person);
        serializ("ser.xml", person);
        serializ("ser.json", person);

        person1 = deSerializ("ser.bin");
        person2 = deSerializ("ser.xml");
        person3 = deSerializ("ser.json");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);


    }

//    public static void binSerializ(String path, Object object){
//        try(FileOutputStream fileOutputStream = new FileOutputStream(path)) {
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(object);
//        }catch (IOException e){
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static Object binDeSerializ(String path){
//        try(FileInputStream fileInputStream = new FileInputStream(path)) {
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//            return objectInputStream.readObject();
//        } catch (IOException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public static void serializ(String path, Object object){
        try{
            if(path.endsWith(".json")){
                ObjectMapper objectMapper = new ObjectMapper();
                objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
                objectMapper.writeValue(new File(path), object);
            } else if (path.endsWith(".xml")) {
                XmlMapper xmlMapper = new XmlMapper();
                xmlMapper.writeValue(new File(path), object);
            } else if (path.endsWith(".bin")) {
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(object);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Person deSerializ(String path){
        Person person = null;
        try{
            if(path.endsWith(".json")){
                ObjectMapper objectMapper = new ObjectMapper();
                person = objectMapper.readValue(new File(path), Person.class);
            } else if (path.endsWith(".xml")) {
                XmlMapper xmlMapper = new XmlMapper();
                person = xmlMapper.readValue(new File(path), Person.class);
            } else if (path.endsWith(".bin")) {
                FileInputStream fileInputStream = new FileInputStream(path);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                person = (Person) objectInputStream.readObject();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return person;
    }


}