package de.szut.soccer4;

public class Player extends Person {

    private int strength;
    private int powerAtGoalKick;
    private int motivation;
    private int numberOfGoals;

    public Player(String name, int age, int strength, int powerAtGoalKick, int motivation, int numberOfGoals) {
        super(name, age);
        this.strength = strength;
        this.powerAtGoalKick = powerAtGoalKick;
        this.motivation = motivation;
        this.numberOfGoals = numberOfGoals;
    }


    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getPowerAtGoalKick() {
        return powerAtGoalKick;
    }

    public void setPowerAtGoalKick(int powerAtGoalKick) {
        this.powerAtGoalKick = powerAtGoalKick;
    }

    public int getMotivation() {
        return motivation;
    }

    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }


    public int shootAtGoal() {
        int result = getPowerAtGoalKick()-(int) (Math.random() * 3 - 2);
        return validate(result);
    }

    public void addGoal() {
        this.numberOfGoals++;
    }

    public boolean ballHold(int powerAtGoalKick) {
        int result = validate(getStrength()-(int) (Math.random() * 3 - 2));
        if (result > powerAtGoalKick) {
            return true;
        }
        return false;
    }
    public int validate(int value) {
        if (value > 10) {
            return 10;
        }
        else if (value < 1) {
            return 1;
        }
        return value;
    }

    @Override
    public String toString() {
        return "\n"+"Player{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", strength=" + strength +
                ", powerAtGoalKick=" + powerAtGoalKick +
                ", motivation=" + motivation +
                '}';
    }
}

