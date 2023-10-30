package com.example.project;



public class Dog {
    private String name;
    private int energy = 10;
    private int happy = 7;
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
        hungry = hungry - 6;
        happy = happy + 3;
        energy = energy - 1;
    }
    public void ignore(String n, String item){
        System.out.println(n + "ignores the" + item);
    }
    public void walk(){
        happy = happy + 2;
        energy = energy -4;
        hungry = hungry + 2;
    }

}