package com.example.project;

public class Hello {


    public static void main(String[] args){

        String dir = "u";
        
        switch(dir.toLowerCase()){
            case "u":
                return "Up";
            case "d":
                return "Down";
            case "r":
                return "Right";
            case "l":
                return "Left";
            case "f":
                return "Front";
            case "b":
                return "Back"
        }


        
    }
}
