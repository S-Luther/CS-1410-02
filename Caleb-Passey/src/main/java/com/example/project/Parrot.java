package com.example.project;

public class Dog {

    public Dog(String n){
        name = n;
        System.out.println("Hi I'm "+n);
    }
    
    private String name;

    private int mood = 10;

    public void Play(Parrot p){
        p.play();
        mood = mood + 2;
        energy = energy - 1;
    }

    private int hunger = 10;

    public void Feed(Parrot p){
        p.feed();
        hunger = hunger + 2;
    }

    private int energy = 10;
    
    public void Sleep(Parrot p){
        p.sleep();
        energy = energy + 2;
        hunger = hunger -1;
    }
}

