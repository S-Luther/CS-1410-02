package com.example.project;

public class Cat implements Feed, Speak, Play{
    private String name;
    public Cat(String n){
        name = n;
        System.out.println("This is " + n + ", your new cat!");

        setMood(m);
        setHunger(0);
        setEnergy(100);

    }

    @Override
    public void feedPet() {
        mood++;
        hunger--;
        System.out.println("Meow!");
    }

    @Override
    public void playtime(){
        mood++;
        hunger++;
        energy--;
    }

    @Override
    public void speaking(){
        mood++;
        System.out.println("Meow!");
    }

}