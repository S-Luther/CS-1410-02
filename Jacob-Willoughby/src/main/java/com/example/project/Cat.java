package com.example.project;

public class Cat {
    private String name;
    private int hunger = 1;
    private int mood = 1;
    private int energy = 1;

    public void goOnWalk() {
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