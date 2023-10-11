package com.example.project;

public class Hello {


    public static void main(String[] args){

        String dir = "f";
        
        switch(dir.toLowerCase()){
            case "u":
                System.out.println("Up");
            case "d":
                System.out.println("Down");
            case "r":
                System.out.println("Right");
            case "l":
                System.out.println("Left");
            case "f":
                System.out.println("Front");
            case "b":
                System.out.println("Back");
        }

//use a println instead of a return.
        
    }
}
