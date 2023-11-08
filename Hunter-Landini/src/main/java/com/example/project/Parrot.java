package com.example.project;

import com.example.project.Interfaces.Feedable;
import com.example.project.Interfaces.Flyable;

public class Parrot extends Pet implements Flyable{

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

    public void fly() {
        System.out.println(name + "flew around a little bit");
        energy = "tired";
        hunger = "hungry";
    }

    
    public void feed() {
        System.out.println("You fed " + name " some birdfeed");
        hunger = "full";
    }
}