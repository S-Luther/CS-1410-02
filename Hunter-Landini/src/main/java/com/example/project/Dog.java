package com.example.project;

import com.example.project.Interfaces.Feedable;
import com.example.project.Interfaces.Playable;

public class Dog extends Pet implements Playable, Feedable{

    public Dog(String n) {
        name = n;
        mood = "happy";
        hunger = "full";
        energy = "awake";
    }    

    public void play() {
        System.out.println("You played with" + name + "by throwing a ball");
        mood = "happy";
        hunger = "hungry";
        energy = "tired";
    }

    
    public void feed() {
        System.out.println("You fed " + name " some dog food");
        hunger = "full";
    }
}