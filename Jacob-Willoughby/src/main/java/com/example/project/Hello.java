package com.example.project;
/*
 * @author Jacob Willoughby
 *
 */
public class Hello {




    public static void main(String[] args){

        String cubeMove = "U";

        switch(cubeMove.toUpperCase()){
            case "U":
                System.out.println("Up");
                break;
            case "D":
                System.out.println("Down");
                break;
            case "L":
                System.out.println("Left");
                break;
            case "R":
                System.out.println("Right");
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