package com.example.project;
public class Dog {
        private String name;
    public Dog(String n){
        name = n;
        System.out.println("You have a new dog!! their name is "+ n);
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
    public void walk(){
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
