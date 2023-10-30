package com.example.project;

public class Parrot {

    public Parrot(String n){
        name = n;
        System.out.println("Hi I'm "+n);
    }

    private String name;

    private int mood = 10;

    public void Play(Cat c){
        c.play();
        mood = mood + 2;
        energy = energy - 1;
    }

    private int hunger = 10;

    public void Feed(Cat c){
        c.feed();
        hunger = hunger + 2;
    }

    private int energy = 10;

    public void Sleep(Cat c){
        c.sleep();
        energy = energy + 2;
        hunger = hunger -1;
    }
}