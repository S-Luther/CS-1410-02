package com.example.project;

public class Cat {
    private String mood;
    private String hunger;
    private String energy;
    private String name;

    public Cat(String n) {
        name = n;
        mood = "bad";
        hunger = "full";
        energy = "awake";
    }

    public void play() {
        System.out.println("You played with " +name);
        mood = "good";
        hunger = "hungry";
        energy = "tired";
    }

    public void feed() {
        System.out.println("You fed " +name);
        hunger = "full";
    }

    public void nap() {
        System.out.println("You let " +name+ " sleep");
        energy = "awake";
    }

    public void observe() {
        System.out.println(name+ " is " + mood);
        System.out.println(name+ " is " + hunger);
        System.out.println(name+ "is " +energy);
        System.out.println();
    }
}