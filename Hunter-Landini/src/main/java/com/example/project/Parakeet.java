package com.example.project;

import com.example.project.Interfaces.Feedable;
import com.example.project.Interfaces.Flyable;

public class Parakeet extends Pet implements Flyable{

    public Parakeet(String n) {
        name = n;
        mood = "good";
        hunger = "full";
        energy = "awake";
    }

    public void fly() {
        System.out.println(name + "flew around a little bit");
        energy = "tired";
        hunger = "hungry";
        mood = "happy";
    }

    
    public void feed() {
        System.out.println("You fed " + name " some birdfeed");
        hunger = "full";
    }
}