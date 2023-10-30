package com.example.project;



class Enemy{

    private int health = 10;

    private String name;

    public Enemy(String Name) {
        name = Name;
        System.out.println(Name + " has come to battle!");
    }

    private void die(){

        name = "deceased " + name;
    }

    public void askName(){
        System.out.println(name);
    }

    public void battle(){
        health--;
        System.out.println(name+" has taken a hit, its new health is: "+health);

        if(health==0){
            die();
        }
    }
}

class Friend {
    private boolean happy;
    private String name;

    public Friend(String N){
        name = N;
        System.out.print("Your friend " + name + " has come to join you!");
    }

    public void makeHappy(){
        happy = true;
        System.out.print(name + " is happy! :)")
    }

    public void makeSad(){
        happy = false;
        System.out.print(name + " is sad... :(")
    }
}

public class Hello {
    public static void main(String[] args){

        Enemy ogre = new Enemy("Ogre");
        Friend sam = new Friend("Sam");

        sam.makeSad();
        same.makeHappy();

        ogre.askName();

        for(int i = 0; i<10; i++){
            ogre.battle();
        }

        ogre.askName();


    }
}