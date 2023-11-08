package com.example.project;

public class Cat {

private String Name;
private int Mood = 5;
private int Hunger = 5;
private int Energy = 5;

public void getName(String name){
    Name = name;
    System.out.println("This cats name is " + name);
    return name;
    }

public void askStats(){
    System.out.println(Name);
    System.out.println("Mood: " + Mood);
    System.out.println("Hunger: " + Hunger);
    System.out.println("Energy: " + Energy);
}


public void eatFood(){
    Energy++
    Hunger--
    }

}