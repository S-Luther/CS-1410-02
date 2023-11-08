package com.example.project;

public class Dog extends mammal implements actions{

    
    public void CatFight(Cat c){
        name = n;
        cname = c.getName();
        System.out.println(n + "bit " + cname);
        mood--;
        energy--;
    }
    public void speak(){
        System.out.println("Bork");
    }

}