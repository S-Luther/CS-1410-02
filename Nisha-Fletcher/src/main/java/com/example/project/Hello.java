package com.example.project;



class Enemy{

    private int health = 10;

    private String name;

    public Enemy(String Name){
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

class Friend(){
    private boolean happy;
    private String name;
    public Friend(String N){
        name = N;
        System.out.println(name + "has come to join your party!");
    }

    public void makeHappy(){
        happy = 1;
    }

    public void makeSad(){
        happy = 0;
    }

    public void findMood(){
        if(happy){
            System.out.println(name + "is happy");
        }
        else{
            System.out.println(name + "is sad");
        }
    }

}

public class Hello {
    public static void main(String[] args){

    
    //  Enemy ogre = new Enemy("Ogre");

    //     ogre.askName();

    //     for(int i = 0; i<10; i++){
    //         ogre.battle();
    //     }

    //     ogre.askName();


    }
}