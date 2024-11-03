package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Statistics {

    private final HashMap<Integer, String> gameStatistics;
    private int gameNumber = 1;

    public Statistics() {
        gameStatistics = new HashMap<>();
    }

    public void addResult(String result) {
        gameStatistics.put(gameNumber++, result);
    }

    public String getStatistics() {
        ArrayList<String> results = new ArrayList<>(gameStatistics.values());
        int wins = 0;
        int loss = 0;
        for(String result : results) {
            if (result.equals("true")){
                wins++;
            }else{
                loss++;
            }
        }
        return "Побед: " + wins + "\nНеудач: " + loss;
    }

    @Override
    public String toString() {
        return gameStatistics.toString();
    }
}
