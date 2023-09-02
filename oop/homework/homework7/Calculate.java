package oop.homework.homework7;

import java.util.Collections;
import java.util.LinkedList;

public class Calculate {

    private Calculation calculator = new Calculation();
    private int index = 0;
    private final LinkedList<String> expression = new LinkedList<>();
    public LinkedList<String> getExpression(){
        return this.expression;
    }
    private void setExpression(String[] expression){
        Collections.addAll(this.expression, expression);
    }

    public Calculate(String input){
        setExpression(new DataPreparation(input).getDate());
    }

    public LinkedList<String> getCalculateLog(){
        return this.calculator.getCalculationLog();
    }

    public void calc(){
        while (index < expression.size() - 1){
            switch (expression.get(index)) {
                case ("*") -> {
                    calculator.addLog("null");
                    calculator.mul(expression.get(index - 1));
                    calculator.mul(expression.get(index + 1));
                    expression.remove(index);
                    expression.add(index, String.valueOf(calculator));
                    expression.remove(index + 1);
                    expression.remove(index - 1);
                    index--;
                }
                case ("/") -> {
                    calculator.addLog("null");
                    calculator.div(expression.get(index - 1));
                    calculator.div(expression.get(index + 1));
                    expression.remove(index);
                    expression.add(index, String.valueOf(calculator));
                    expression.remove(index + 1);
                    expression.remove(index - 1);
                    index--;
                }
            }
            index++;
        }
        calculator.addLog("null");
        while (expression.size() > 0){
            String i = expression.pollFirst();
            switch (i) {
                case ("-") -> calculator.sub(expression.pollFirst());
                case ("+") -> calculator.add(expression.pollFirst());
                default -> calculator.add(i);
            }
        }
    }

    public Calculation getResult(){
        return calculator;
    }



}
