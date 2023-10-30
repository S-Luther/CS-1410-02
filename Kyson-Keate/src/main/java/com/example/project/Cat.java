package com.example.project;



public class Cat {
    private String name;
    private int energy = 4;
    private int happy = 2;
    private int hungry = 3;
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
        hungry = hungry - 4;
        happy = happy + 1;
        energy = energy - 1;
    }
    public void ignore(String n, String item){
        System.out.println(n + "ignores the" + item);
    }
    public void walk(){
        happy = happy - 1;
        energy = energy -2;
        hungry = hungry + 2;
    }
}