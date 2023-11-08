package com.example.project.animals;

public class Parrot{
    private int energy;
    energy = 10;
    private int mood;
    mood = 12;
    private String name;
    public int hunger;

    public void Parrot(String N){
        name = N;
    }

    private int hunger;

    public void sleep(){
        energy++;
        hunger++;

    }

    public void talk(){
        energy--;
        hunger--;
        mood++;
    }

    public void eat(){
        hunger--;
    }

}