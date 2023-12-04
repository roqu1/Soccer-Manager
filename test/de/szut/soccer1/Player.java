package de.szut.soccer1;

public class Player {
    private String name;
    private int age;
    private int strength;
    private int powerAtGoalKick;
    private int motivation;
    private int numberOfGoals;

    public Player(String name, int age, int strength, int powerAtGoalKick, int motivation, int numberOfGoals) {
        this.name = name;
        this.age = age;
        this.strength = strength;
        this.powerAtGoalKick = powerAtGoalKick;
        this.motivation = motivation;
        this.numberOfGoals = numberOfGoals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", strength=" + strength +
                ", powerAtGoalKick=" + powerAtGoalKick +
                ", motivation=" + motivation +
                '}';
    }
}

