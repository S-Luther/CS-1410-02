package com.example.project;

public class Hello {
    static void Print(String wrd){
        System.out.println(wrd);
        
        
        static int[][] numbers = {
            {1, 2},
            {3, 4}
        }               
    }
    
    public static void main(String[] args){
        String[] helloWorld = {"Hello World!"};

        Print(helloWorld[0]);

        for(int x = 0; x < 2; x++){
            System.out.print(numbers[0][x]);
        }
        System.out.println();
        for(int y = 0; y < 2; y++){
            System.out.print(numbers[1][y]);
        }
    }
}