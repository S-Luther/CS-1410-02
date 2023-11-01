package com.example.project;

public class Cat{

    private String name;
    private int mood=10;
    private int energy=10;
    private int hunger=5;

    public Player(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void giveMilk(){
    mood++;
    hunger--;
    energy++;
    getMood();
    getEnergy();
    getHunger();
    }

    public void giveBath(){
    mood--;
    hunger++;
    energy--;
    getMood();
    getEnergy();
    getHunger();

    }

    public int getMood(){
        return mood;
    }
    
    public int getHunger(){
        return hunger;
    }

    public int getEnergy(){
        return energy;
    }
}