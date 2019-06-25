package com.eddie;

public class FootballTeam implements Comparable<FootballTeam> {
    private String name;
    private int points;

    public FootballTeam(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "FootballTeam{" +
                "name='" + name + '\'' +
                ", points=" + points +
                '}';
    }

    @Override
    public int compareTo(FootballTeam team) {
        if (this.getPoints() > team.getPoints()) {
            return -1;
        } else if (this.getPoints() < team.getPoints()) {
            return 1;
        } else {
            return 0;
        }
    }
}
