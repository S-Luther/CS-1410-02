package com.example.project;

public class Player {

    private String name;
    private int health = 100;


    public Player(String n){
        name = n;
        System.out.println("Hi I'm "+n);
    }

    public String getName(){
        return name;
    }

    public void askName(){
        System.out.println("Hi I'm "+name);
    }

    public void fightGoblin(Goblin g){
        g.battle();
        health = health - 2;
        System.out.println(name+ " has struck " + g.getName() + " with a nasty dagger.");
        System.out.println(name+ " has " + health + " health left after that battle.");
        System.out.println(g.getName()+ " has " + g.getHealth() + " health left after that battle.");


    }

    public void fightOgre(Ogre o){
        o.battle();
        health = health - 50;
    }
    
}
