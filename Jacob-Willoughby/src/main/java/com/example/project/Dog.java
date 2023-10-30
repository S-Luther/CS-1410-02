package com.example.project;

public class Dog {
    private String name;
    private int hunger = 1;
    private int mood = 1;
    private int energy = 1;

    public String getName(){
        return name;
    }

    public void goOnWalk() {
        mood++;
        hunger++;
        energy--;
    }
    
    public void feed() {
        mood++;
        hunger--;
        energy++;
    }
    
    public void CatFight(Dog n Cat c){
        name = n;
        System.out.println(n + "bit " + c);
        mood--;
        energy--;
    }

}