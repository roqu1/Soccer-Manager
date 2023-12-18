package de.szut.soccer5;

public class SoccerManagerUI {
    public static void main(String[] args) {

        Coach coach2 = new Coach("Flick", 55, 10);
        Goalkeeper goalkeeper2 = new Goalkeeper("Neuer", 33, 10, 10, 10, 0);
        Team bayern = new Team("Bayern München", coach2, goalkeeper2);
        bayern.addPlayer(new Player("Pavard", 24, 7, 6, 8, 0));
        bayern.addPlayer(new Player("Alaba", 28, 8, 7, 8, 0));
        bayern.addPlayer(new Player("Boateng", 32, 9, 5, 8, 0));
        bayern.addPlayer(new Player("Davies", 20, 8, 9, 8, 0));
        bayern.addPlayer(new Player("Kimmich", 25, 9, 6, 8, 0));
        bayern.addPlayer(new Player("Goretzka", 25, 9, 8, 8, 0));
        bayern.addPlayer(new Player("Müller", 31, 10, 8, 8, 0));
        bayern.addPlayer(new Player("Gnabry", 25, 7, 7, 7, 0));
        bayern.addPlayer(new Player("Coman", 24, 10, 8, 8, 0));
        bayern.addPlayer(new Player("Lewandowski", 32, 10, 9, 8, 0));

        Coach coach = new Coach("Terzic", 38, 5);
        Goalkeeper goalkeeper = new Goalkeeper("Bürki", 30, 7, 2, 10, 7);
        Team dortmund = new Team("Borussia Dortmund",coach, goalkeeper);
        dortmund.addPlayer(new Player("Meunier", 29, 7, 5, 8, 0));
        dortmund.addPlayer(new Player("Akanji", 25, 8, 6, 8, 0));
        dortmund.addPlayer(new Player("Hummels", 31, 9, 5, 8, 0));
        dortmund.addPlayer(new Player("Guerreiro", 26, 8, 9, 8, 0));
        dortmund.addPlayer(new Player("Witsel", 31, 9, 6, 8, 0));
        dortmund.addPlayer(new Player("Brandt", 24, 9, 8, 8, 0));
        dortmund.addPlayer(new Player("Sancho", 20, 10, 8, 8, 0));
        dortmund.addPlayer(new Player("Bellingham", 17, 7, 7, 7, 0));
        dortmund.addPlayer(new Player("Reus", 31, 10, 8, 8, 0));
        dortmund.addPlayer(new Player("Haaland", 20, 9, 9, 8, 0));

        System.out.println(bayern.toString());
        System.out.println(dortmund.toString());

        Game game = new Game(bayern, dortmund);
        System.out.println('\n'+"Spielstand: "+ game.getScore());
        game.increaseHomeGoals();
        game.increaseHomeGoals();
        System.out.println('\n'+"Spielstand: "+ game.getScore());
        game.increaseAwayGoals();




        System.out.println("Mannschaft: Bayern");
        System.out.println("Mannschaftsstärke: " + bayern.getTotalForce());
        System.out.println("Motivation: "+ bayern.getTotalMotivation());

        System.out.println('\n'+"Mannschaft: Dortmund");
        System.out.println("Mannschaftsstärke: " + dortmund.getTotalForce());
        System.out.println("Motivation: "+ dortmund.getTotalMotivation());

        System.out.println('\n'+"Spielstand: "+ game.getScore());
    }
}
