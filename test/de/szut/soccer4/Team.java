package de.szut.soccer4;

import java.util.ArrayList;

public class Team {
    private Coach coach;
    private Goalkeeper goalkeeper;
    private String name;
    private ArrayList<Player> squad = new ArrayList<>();

    public Team(String name,Coach coach, Goalkeeper goalkeeper) {
        this.coach = coach;
        this.goalkeeper = goalkeeper;
        this.name = name;
        this.squad = new ArrayList<Player>();
    }

    public void addPlayer(Player player) {
        this.squad.add(player);
    }

    public int getTotalMotivation() {
        int sum = 0;
        for (int i = 0; i < squad.size(); i++) {
            sum += this.squad.get(i).getMotivation();

        }
        return sum/this.squad.size();
    }

    public int getTotalForce() {
        int sum = 0;
        for (int i = 0; i < squad.size(); i++) {
            sum += this.squad.get(i).getStrength();
        }
        return sum/this.squad.size();
    }

    @Override
    public String toString() {
        return "***" + name + "***\n" +
                "Trainer: " + coach.getName() + "\n" +
                "Torhüter: " + goalkeeper.getName() + "\n" +
                "Spieler: " + squad.toString() + "\n";
    }
}
