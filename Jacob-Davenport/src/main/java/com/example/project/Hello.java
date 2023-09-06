package com.example.project;

public class Hello {
    static void Print(String wrd){
        System.out.println(wrd);
    }
    
    public static void main(String[] args){
        String[] helloWorld = {"Hello World!"};

        Print(helloWorld[0]);
    }
}