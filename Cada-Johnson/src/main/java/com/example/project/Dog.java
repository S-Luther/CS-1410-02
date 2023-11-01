package com.example.project;


public class Dog {

private String Name;
private int Mood = 5;
private int Hunger = 5;
private int Energy = 5;


public String askName(String name){
    Name = name;
    System.out.println("This dogs name is " + name)
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