package com.example.project;

class Friend{

    private String name;
    private boolean happy;

    public Friend(String N){

        name = N;
        System.out.println(name);
    }

    public void makeHappy(){
        happy = true; 
    }
    
    public void makeSad(){
        happy = false;
    }

}

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

public class Hello {
    public static void main(String[] args){



        // Enemy ogre = new Enemy("Ogre");
        // ogre.askName();
        // for(int i = 0; i<10; i++){
        //     ogre.battle();
        // }
        // ogre.askName();
    }
}

