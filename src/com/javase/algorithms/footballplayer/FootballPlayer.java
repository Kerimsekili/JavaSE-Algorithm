package com.javase.algorithms.footballplayer;

public class FootballPlayer {
    int no;
    String name;
    int minutes;
    boolean inPlay;
    int numberOfGoals;

    void play(int minutesToPlay)
    {
        minutes =+ minutesToPlay;
    }

    void score()
    {
        numberOfGoals =numberOfGoals+1;
    }
}
