package org.example;

import java.util.HashMap;

public class Statistics {

    private HashMap<Integer, String> gameStatistics;
    private int gameNumber = 1;

    public Statistics() {
        gameStatistics = new HashMap<>();
    }

    public void addResult(String result) {
        gameStatistics.put(gameNumber++, result);
    }

    @Override
    public String toString() {
        return gameStatistics.toString();
    }
}
