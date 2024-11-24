package oop.homework.homework7;

import oop.homework.homework7.operations.*;

import java.util.LinkedList;

public class Calculation {//extends InputValues {

    private String result = "0";
    LinkedList<String> calculationLog = new LinkedList<>();

    public void addLog(String addLog){
        this.calculationLog.add(addLog);
    }
    public LinkedList<String> getCalculationLog(){
        return calculationLog;
    }

    private void setResult(String result){
        this.result = result;
    }

    private String getResult(){
        return this.result;
    }
    public Calculation(){
        addLog("null");
    }
    public void add(String number){
        if (calculationLog.getLast().equals("null")){
            this.result = number;
            calculationLog.add(result);
        }
        else {
            setResult(String.valueOf(new Addition(number, this.result)));
            calculationLog.add(result);
        }
    }
    public void sub(String number){
        if (calculationLog.getLast().equals("null")){
            this.result = number;
            calculationLog.add(result);
        }
        else{
            setResult(String.valueOf(new Subtraction(this.result, number)));
            calculationLog.add(result);
        }
    }
    public void mul(String number){
        if (calculationLog.getLast().equals("null")){
            this.result = number;
            calculationLog.add(result);
        }
        else{
            setResult(String.valueOf(new Multiplication(number, this.result)));
            calculationLog.add(result);
        }
    }
    public void div(String number){
        if (calculationLog.getLast().equals("null")){
            this.result = number;
            calculationLog.add(result);
        }
        else{
            if (Double.parseDouble(number) != 0){
                setResult(String.valueOf(new Division(this.result, number)));
                calculationLog.add(result);
            }
            else {
                calculationLog.add("Деление на ноль(");
                throw new ArithmeticException("Деление на ноль(");
            }
        }
    }

    @Override
    public String toString() {
        return result;
    }
}
