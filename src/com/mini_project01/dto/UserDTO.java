package com.mini_project01.dto;

public class UserDTO {
    private String name;
    private String gender;
    private Boolean isLiving = false;
    private String ability;
    private int life;
    private int food;

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", isLiving=" + isLiving +
                ", ability='" + ability + '\'' +
                ", life=" + life +
                ", food=" + food +
                '}';
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getLiving() {
        return isLiving;
    }

    public void setLiving(Boolean living) {
        isLiving = living;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }
}
