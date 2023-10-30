package com.example.project;

public class Ogre {
    private String name;

    private int health = 400;


    public Ogre(String n){
        name = n;
        System.out.println("A Ogre named "+n+" has entered the field.");
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public void battle(){
        health--;
    }
}
