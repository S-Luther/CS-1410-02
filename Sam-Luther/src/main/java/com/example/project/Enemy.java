package com.example.project;

public class Enemy extends Creature{
    protected int health;
    private boolean alive = true;

    protected void setHealth(int h){
        health = h;
    }

    private void die(){
        System.out.println(name + " has passed away.");
        name = "deceased " + name;
    }

    public int getHealth(){
        return health;
    }

    public void battle(){
        if(alive){
            health--;
            if(health == 0){
                die();
            }
        }else{
            System.out.println("You cannot fight " + name);
        }
    }
}
