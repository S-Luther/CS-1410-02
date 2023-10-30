package com.example.project;

public class Cat {

    public Cat(String n){
        name = n;
        System.out.println("Hi I'm "+n);
    }

    private String name;

    private int mood = 10;

    public void Play(Dog d){
        d.play();
        mood = mood + 2;
        energy = energy - 1;
    }

    private int hunger = 10;

    public void Feed(Dog d){
        d.feed();
        hunger = hunger + 2;
    }

    private int energy = 10;

    public void Sleep(Dog d){
        d.sleep();
        energy = energy + 2;
        hunger = hunger -1;
    }
}