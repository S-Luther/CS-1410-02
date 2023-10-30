package com.example.project;


//maybe rename this to friend, and then you can remove the enemy constructor on like 11
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

class Friend{
    private String name;
 public Friend(String Name){
        name = Name;
        System.out.println(Name + " has come to help!");
    }

    private boolean happy(){
        boolean emo=true;
        return emo;
    }

    public void makeHappy(){
       boolean emo=true;
       System.out.println("Friend is happy: "+ emo);
    }

    public void makeSad(){
        boolean emo=false;
        System.out.println("Friend is happy: "+ emo);
    }
    public void askName(){
        System.out.println(name);
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

        friend.makeHappy();

        friend.makeSad();


    }
}

