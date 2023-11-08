package com.example.project;

import com.example.project.Interfaces.Playable;
import com.example.project.Interfaces.Feedable;

public class Cat extends Pet implements Playable{
    

    public Cat(String n) {
        name = n;
        mood = "bad";
        hunger = "full";
        energy = "awake";
    }

    public void play() {
        System.out.println("You played with" + name + "by using a pointer laser");
        mood = "good";
        hunger = "hungry";
        energy = "tired";
    }

    
    public void feed() {
        System.out.println("You fed " + name " some cat food");
        hunger = "full";
    }
}