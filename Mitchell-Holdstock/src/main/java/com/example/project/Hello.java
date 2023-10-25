package com.example.project;



class Enemy{

    private int health = 10;

    private String name;

    public Enemy(String Name){
        name = Name;
        System.out.println(Name + " has come to battle!");
    }

    public Friend(String Name){
        name = Name;
        System.out.println(Name + " has come to help!");
    }

    private boolean happy(){
        boolean emo=1;
    }

    private boolean sad(){
        boolean emo=0;
    }

    public static
    

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

        Enemy ogre = new Enemy("Ogre");

        ogre.askName();

        for(int i = 0; i<10; i++){
            ogre.battle();
        }

        ogre.askName();

        Friend friend = new Friend("Friend");

        friend.askName();


    }
}

