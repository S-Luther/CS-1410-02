package com.example.project;

class Friend {
    private boolean happy;
    private String name;

    private Friend(String N) {
        name = N;
    }


    public void makeHappy() {
        happy = true;
    }

    public void makeSad() {
        happy = false;
    }
}

public class Hello {

	public static void main(String[] args) {
        
    } 
}


//if you'd like you should add some interactions with an object down in the main method.