package org.example;

import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeList {

    LinkedList<Employee> employees;

    public EmployeeList() {
        employees = new LinkedList<>();
    }
    public EmployeeList(Employee employee){
        employees = new LinkedList<>();
        this.employees.add(employee);
    }
    public EmployeeList(LinkedList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }
    public void addEmployees(int personnelNumber, int phoneNumber,
                             String nane, int experience){
        this.addEmployee(new Employee(personnelNumber, phoneNumber,
        nane, experience));
    }

    public String searchByExperience(int experience){
        for (Employee employee : employees) {
            if(employee.getExperience() == experience){
                return employee.toString();
            }
        }
        return null;
    }

    public String searchByPersonelNumber(int personnelNumber){
        for (Employee employee : employees) {
            if(employee.getExperience() == personnelNumber){
                return employee.toString();
            }
        }
        return null;
    }

    public String searchByName(String name){
        for (Employee employee : employees) {
            if(employee.getNane().equals(name)){
                return String.valueOf(employee.getPhoneNumber());
            }
        }
        return null;
    }


    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        for(Employee employee: this.employees){
            str.append(employee.toString()).append("\n");
        }
        return str.toString();
    }


}
