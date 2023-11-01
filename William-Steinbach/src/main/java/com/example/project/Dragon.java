package com.example.project;
public class Dragon extends Feed {
        private String name;
    public Dragon(String n){
        name = n;
        System.out.println("You have a new dragon!! their name is "+ n);
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
    public void fly(){
        mood++;
        energy--;
        hunger++;
    }
}