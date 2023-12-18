package de.szut.soccer5;

public class Coach extends Person {

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
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", experience=" + experience +
                '}';
    }
}
