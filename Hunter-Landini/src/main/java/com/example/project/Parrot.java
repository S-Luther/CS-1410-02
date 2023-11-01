package com.example.project;

public class Parrot {
    private String mood;
    private String hunger;
    private String energy;
    private String name;

    public Dog(String n) {
        name = n;
        mood = "good";
        hunger = "full";
        energy = "awake";
    }

    public void talk() {
        System.out.println("You talked to " +name);
        mood = "happy";
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