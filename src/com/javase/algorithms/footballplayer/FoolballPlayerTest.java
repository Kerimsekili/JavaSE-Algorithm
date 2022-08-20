package com.javase.algorithms.footballplayer;

public class FoolballPlayerTest {
    public static void main(String[] args) {
        FootballPlayer alex = new FootballPlayer();
        alex.no = 10;
        alex.name = "Alex De Souza";
        alex.minutes = 0;
        alex.inPlay = true;
        alex.numberOfGoals = 0;
        alex.play(90);
        alex.score();
        System.out.println("Number of goals Alex scored: "+ alex.numberOfGoals);// number of goals2
        System.out.println("Alex played totally " + alex.minutes + " minutes so far.");// minutes is 90

        System.out.println("**************************");

        final FootballPlayer hagi = new FootballPlayer();
        hagi.no = 10;
        hagi.name = "Hagi";
        hagi.minutes = 0;
        hagi.inPlay = true;
        hagi.numberOfGoals = 0;
        hagi.play(60);
        hagi.score();
        hagi.score();
        hagi.score();
        System.out.println("Number of goals Alex scored: "+ hagi.numberOfGoals);// number of goals2
        System.out.println("Alex played totally " + hagi.minutes + " minutes so far.");// minutes is 90
        
    }
}
