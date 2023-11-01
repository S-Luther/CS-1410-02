package com.example.project;
public class Parrot {
    private String name;
    public Parrot(String n){
        name = n;
        System.out.println("You have a new cat!! their name is "+ n);
    }
    private int mood = 0;
    public int mood (){
        return mood;
    }
    private int hunger = 0;
    public int hunger (){
        return hunger;
    }
    private int energy = 0;
    public int energy (){
        return energy;
    }
    public void talk(){
        mood++;
        energy--;
        hunger++;
    }
    public void feed(){
        mood++;
        energy++;
        hunger--;
    }
}