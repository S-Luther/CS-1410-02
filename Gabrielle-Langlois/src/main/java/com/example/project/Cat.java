package com.example.project;

public class Cat extends Mammal{

    private String name;
    private int Mood;
    private int Hunger;
    private int Energy;

    private Cat(String n){
        name = n;
    }
    

    public void ruinTheCouch(){
        Mood++;
        Hunger++;
        Energy--;
    }

}