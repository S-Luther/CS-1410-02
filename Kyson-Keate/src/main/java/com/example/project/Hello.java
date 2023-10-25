package com.example.project;
class Friend{
    private boolean happy;
    private String name;
    public Friend (String Name){
        name = Name;
        System.out.println("Hanging out with " + name);
    }
    public void makeHappy(){
        happy = true;
        friendMood();
    }
    public void makeSad(){
        happy = false;
        friendMood();
    }
    private void friendMood(){
        if(happy = true){
            System.out.println(name + " seems happy today");
        }
        else if(happy = false){
            System.out.println(name + " seems sad today");
        }
        else{
            System.out.println(name + "'s expression is unreadable");
        }
    }

}

public class Hello {
    public void main(String[] args){
        Friend John = new Friend("John");
        John.makeHappy();
        
    }
}