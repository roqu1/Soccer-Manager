package de.szut.soccer2;

public class SoccerManagerUI {
    public static void main(String[] args) {
        Player ronaldo = new Player("Ronaldo", 33, 10, 6, 10, 0);
        Player messi = new Player("Messi", 31, 10, 4, 10, 0);
        Coach coach = new Coach("Klopp", 51, 7);
        Goalkeeper neuer = new Goalkeeper("Neuer", 33, 10, 10, 10, 0, 10);

        System.out.println(ronaldo);
        int tryGoal = ronaldo.shootAtGoal();
        System.out.println(tryGoal);
        System.out.println(messi);
        tryGoal = messi.shootAtGoal();
        System.out.println(tryGoal);
        System.out.println(coach);
        System.out.println(neuer);
        tryGoal = neuer.shootAtGoal();
        System.out.println(tryGoal);

    }
}
