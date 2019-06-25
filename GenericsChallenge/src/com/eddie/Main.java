package com.eddie;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        League<FootballTeam> footballLeague = new League<>("NFL");

        FootballTeam patriots = new FootballTeam("New England Patriots", 4);
        FootballTeam chargers = new FootballTeam("San Diego Chargers", 8);
        FootballTeam seahawks = new FootballTeam("Seattle Seahawks", 6);
        FootballTeam packers = new FootballTeam("Green Bay Packers", 3);

        footballLeague.leagueTeams.add(patriots);
        footballLeague.leagueTeams.add(chargers);
        footballLeague.leagueTeams.add(seahawks);
        footballLeague.leagueTeams.add(packers);

        printStandings(footballLeague.leagueTeams);

    }

    private static void printStandings(ArrayList<FootballTeam> league) {
        Collections.sort(league);

        for(int i = 0; i < league.size(); i++) {
            System.out.println(league.get(i).getName());
        }
    }
}
