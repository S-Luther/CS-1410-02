package com.example.project;

public class Cat extends mammal implements actions {
    public Cat(String c){
        name = c;
    }
    public void DogFight(Dog n){
        cname = name;
        nname = n.getName();
        System.out.println(cname + "scrattched " + nname);
        mood--;
        energy--;
    }
    public void speak(){
        System.out.println("Meow");
    }

}