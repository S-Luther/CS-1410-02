package com.example.project;

public class Parrot {
    private String name;
    private int hunger = 1;
    private int mood = 1;
    private int energy = 1;

    public String getName(){
        return name;
    }

    public void letFly() {
        mood++;
        hunger++;
        energy--;
    }
    
    public void feed() {
        mood++;
        hunger--;
        energy++;
    }

}