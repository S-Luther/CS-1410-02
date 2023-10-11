package com.example.project;

public class Hello {

    public static void main(String[] args){
       Scanner move = new Scanner(System.in);
       System.out.println("Enter a move: U,D,R,L,F,B");

       String nextmove = move.nextLine();

       nextmove = nextmove.toUpperCase();

       switch(nextmove){
        case "U": System.out.println("Up");
            break;
        case "D": System.out.println("Down");
            break;
        case "R": System.out.println("Right");
            break;
        case "L": System.out.println("Left");
            break;
        case "F": System.out.println("Front");
            break;
        case "B": System.out.println("Back");
            break;
        default:
            System.out.println("Invalid Move");
            break;
       }


    }

}

