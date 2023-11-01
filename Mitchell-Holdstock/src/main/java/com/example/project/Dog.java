package com.example.project;

public class Dog{

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

    public void giveTreat(){
    mood++;
    hunger--;
    energy++;
    getMood();
    getEnergy();
    getHunger();

    }

    public void goOnWalk(){
    mood++;
    hunger++;
    energy--;
    getMood();
    getEnergy();
    getHunger();

    }
    //very well done!
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