package com.example.project;

public class Hello {

public int sum( int i, int j){
   i+=j;
   return i;
   }
   public static void main(String[] args){

    
        Friend gregory= new Friend("Gregory");

            gregory.makehappy();
            System.out.println(name + "is" + happy);




   
    Hello h = new Hello();

    System.out.println(h.sum(15,16));

   }










	



}

class Friend {
    private boolean happy = true;
    private String name;
    public Friend(String N){

        name = N;

    }
    public void makeHappy(){
        happy = true;
    }
    public void makeSad(){
        happy= false;
    }






}