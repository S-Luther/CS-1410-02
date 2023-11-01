package com.example.project;

public class animal {
    protected String name;
    protected int hunger = 1;
    protected int mood = 1;
    protected int energy = 1;

    protected void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

    public void feed(){
        mood++;
        hunger--;
        energy++;
    }
}
