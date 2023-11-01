package com.example.project;

public class Entity {

    protected int[] location = new int[2];
    protected boolean visible;
    protected boolean cursed = false;

    public boolean getVisibility(){
        return visible;
    }

    public int[] getLocation(){
        return location;
    }

    protected void updateLocation(int [] i){
        location = i;
    }
    
}
