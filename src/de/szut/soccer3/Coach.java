package de.szut.soccer3;

public class Coach extends Person {
    private String name;
    private int age;
    private int experience;
    public Coach(String name, int age, int experience) {
        super(name, age);
        this.experience = validate(experience);

    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = validate(experience);

    }
    public int validate(int value) {
        if(value>10) {
            return 10;
        } else if (value<1) {
            return 1;
        }
        return value;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                '}';
    }
}
