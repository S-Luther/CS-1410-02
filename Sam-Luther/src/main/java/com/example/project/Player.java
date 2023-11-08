package com.example.project;

import com.example.project.Attacks.HeavyAttack;
import com.example.project.Attacks.Skirmish;
import com.example.project.Social.Persuador;

public class Player implements HeavyAttack, Skirmish, Persuador{

    private String name;
    private int strength;
    

    public Player(String n){
        name = n;
    }

    @Override
    public void useHeavyAttack() {
        System.out.println(name+" delivered a blow of " + strength*2 + " damage");
    }

    @Override
    public void useSkirmishAttack(int speed) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'useSkirmishAttack'");
    }

    @Override
    public void flatter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'flatter'");
    }

    @Override
    public void charm() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'charm'");
    }

    @Override
    public void goad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'goad'");
    }
    
}
