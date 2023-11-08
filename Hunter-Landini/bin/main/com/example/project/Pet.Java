package com.example.project;

public class Pet {
    protected String name;
    protected String mood;
    protected String hunger;
    protected String energy;
    
    public void nap() {
        System.out.println(name + " took a nap");
        energy = "awake";
        mood = "good";
    }

    public void observe() {
        System.out.println();
        System.out.println(name + "is feeling " + mood);
        System.out.println(name + "is " + hunger);
        System.out.println(name + "is" + energy);
        System.out.println();
    }
}