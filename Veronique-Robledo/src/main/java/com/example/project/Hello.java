package com.example.project;

public class Hello{

    public static void main(String[] args){

        String moves= "U";
        switch(moves.toLowercase()) {
            case "u":
                System.out.println("Up");
                break;
            case "d":
                System.out.println("Down");
                break;
            case "r":
                System.out.println("Right");
                break;
            case "l":
                System.out.println("Down");
                break;
            case "f":
                System.out.println("Front");
                break;
            case "b":
                System.out.println("Back");
                break;
        }
    } 
}


//actaully make sure you wrap the cases in ""




