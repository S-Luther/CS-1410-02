package com.example.project;



public class Pet implements Sound, food{
    protected int happy;
    protected int hungry;
    protected int energy;
    protected String name;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setnoise(String s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setnoise'");
    }
    public String setFood(String f) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setfood'");
    }
    public void foodtype(){

    }



    private void sleep(){
        if(energy < 2){
            System.out.println("Your pet " + name + " is taking a nap");
            energy = energy + 5;
            hungry = hungry + 2;
            happy = happy + 1;
        }
        else{
            System.out.println("Your pet " + name + " is not tired at this time");
        }
    }
}