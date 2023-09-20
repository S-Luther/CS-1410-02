package com.example.project;

public class Hello {

    public static void main(String[] args){

        String move = "u";
        System.out.println("Input: " + move);
        System.out.print("Output: ");
        
        switch(move.toUpperCase()){
            case "U":
                System.out.println("Up");
                break;
            case "D":
                System.out.println("Down");
                break;
            case "R":
                System.out.println("Right");
                break;
            case "L":
                System.out.println("Left");
                break;
            case "F":
                System.out.println("Front");
                break;
            case "B":
                System.out.println("Back");
                break;
            
        }        
    }
}