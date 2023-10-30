package com.example.project;

public class Goblin {

    private String name;

    private int health = 4;

    private void die(){
        System.out.println(name+" has passed away.");
        name = "deceased "+ name;
    }

    public Goblin(String n){
        name = n;
        System.out.println("A Goblin named "+n+" has entered the field.");
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public void battle(){
        health--;
        if(health == 0){
            die();
        }
    }
    
}
