package com.example.project;

public class Cat extends mammal {

    public Cat(String n){
        name = n;
    }
    public void DogFight(Dog n){
        c = name;
        nname = n.getName();
        System.out.println(c + "scrattched " + nname);
        mood--;
        energy--;
    }

}