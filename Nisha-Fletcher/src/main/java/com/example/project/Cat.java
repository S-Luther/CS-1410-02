package com.example.project;

public class Cat{
public int energy;
public int mood;
public int chaos;

public String name;
//if you'd like you could put this in a constructor also with public Cat(String N, ...){}
public Cat(String N, int E,int M,int C){
name = N;
energy = E;
mood = M;
chaos = C;
}

public void petCat(){
    mood++;
}

public void feed(){
    mood++;
    energy++;
    chaos--;
}

public void play(){
    energy--;
    chaos++;
}


public void getStats(){
    System.out.print("energy: " + energy + "mood: " + mood+ "chaos: " + chaos);
}

}