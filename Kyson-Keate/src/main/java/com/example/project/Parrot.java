package com.example.project;



public class Parrot {
    private String name;
    private int energy = 5;
    private int happy = 5;
    private int hungry = 3;
    public void main(String[] args){
        
    }
    public void feed(int hunger){
        hunger = hungry;
        if(hunger > 6){
            eatFood();
        }
        else{
            ignore(name, "food");
        }
    }
    public void eatFood(){
        hungry = hungry - 5;
        happy = happy + 2;
        energy = energy - 1;
    }
    public void ignore(String n, String item){
        System.out.println(n + "ignores the" + item);
    }
    public void walk(){
        happy = happy + 2;
        energy = energy -2;
        hungry = hungry + 2;
    }
}