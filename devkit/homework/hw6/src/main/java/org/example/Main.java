package org.example;

public class Main {

    public static void main(String[] args) {
        ShowBegins showBegins = new ShowBegins();
        for (int i = 0; i < 1000; i++){
            showBegins.startWithRecordStatistics();
        }
        showBegins.getStatistics();

    }
}