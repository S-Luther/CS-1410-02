package com.example.project;

public class Parrot extends Bird{

    public Parrot(String n) {
        name = n;
        mood = "good";
        hunger = "full";
        energy = "awake";
    }

    public void talk() {
        System.out.println("You talked to " +name);
        mood = "happy";
        hunger = "full";
        energy = "tired";
    }    
}