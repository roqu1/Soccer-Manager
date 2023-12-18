package de.szut.soccer5;

public class Game {
    private Team home;
    private Team away;
    private int homeGoals;
    private int awayGoals;

    public Game(Team home, Team away) {
        this.home = home;
        this.away = away;
    }

    public Team getHome() {
        return home;
    }

    public void setHome(Team home) {
        this.home = home;
    }

    public Team getAway() {
        return away;
    }

    public void setAway(Team away) {
        this.away = away;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(int homeGoals) {
        this.homeGoals = homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(int awayGoals) {
        this.awayGoals = awayGoals;
    }

    public void increaseHomeGoals() {
        this.homeGoals++;
    }

    public void increaseAwayGoals() {
        this.awayGoals++;
    }

    @Override
    public String toString() {
        return home+" - "+away;
    }

    public String getScore() {
        return homeGoals + ":" + awayGoals;
    }
}

