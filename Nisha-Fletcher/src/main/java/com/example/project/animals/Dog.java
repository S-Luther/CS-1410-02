package com.example.project.animals;

public class Dog extends Mammal{
    
    public int energy = 11;
    public int mood = 12;
    public int loyalty = 3;
    public int hunger;

    public String name;

    public void Dog(String N){
        name = N;
    }



public void play(){
   energy--;
   mood++;
}

public void feed(){
    energy++;
    mood++;
    loyalty++;
}
    
}