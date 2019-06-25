package com.eddie;

import java.util.ArrayList;

public class League<T extends FootballTeam> {
    private String name;

    ArrayList<T> leagueTeams;

    public League(String name) {
        this.name = name;
        leagueTeams = new ArrayList<>();
    }

}
