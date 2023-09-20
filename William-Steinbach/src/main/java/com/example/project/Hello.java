package com.example.project;

public class Hello{
    public static void main (String[] args){
       char moves = 'u';
       switch(moves){
        case u:
            System.out.println("Up");
            break;
        case d:
            System.out.println("down");
            break;
        case r:
            System.out.println("right");
            break;
        case l:
            System.out.println("left");
            break;
        case f:
            System.out.println("f");
            break;
        case b:
            System.out.println("back");
            break;
       }
    }
}