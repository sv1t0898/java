package org.example;

public class Main {
    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();
        for (int i = 0; i < 20; i++){
            employeeList.addEmployees(i,i,String.valueOf("user" + i),i);
        }
        System.out.println(employeeList.toString());

        System.out.println("search");
        System.out.println(employeeList.searchByExperience(19));;
        System.out.println(employeeList.searchByName("user5"));;
        System.out.println(employeeList.searchByPersonelNumber(8));;
    }
}