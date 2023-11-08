package com.example.project;

public class Feed{
    public void feedPet();

    protected void setMood(int m){
        mood = m;   
    }

    protected void setHunger(int h){
        hunger = h;
    }

    protected void setEnergy(int e){
        energy = e;
    }
    
    public void feeding(){
        mood++;
        hunger--;
        energy++;
    }
}