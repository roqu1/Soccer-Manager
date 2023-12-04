package de.szut.soccer1;

public class Coach {
    private String name;
    private int age;
    private int experience;
    public Coach(String name, int age, int experience) {
        this.name = name;
        this.age = validate(age);
        this.experience = validate(experience);

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
