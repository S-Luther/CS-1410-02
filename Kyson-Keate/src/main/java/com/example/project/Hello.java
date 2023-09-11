package com.example.project;

public class Hello {
    public static void main(String[] args){
        String[] statements= {
            "Hello World!"
        }
        Print(statements[0]);
        Arraypractice();
    }
    public static void Print(String(i)){
        System.out.println(i);
    }
    
    public static void Arraypractice();{
        int[][] numbers = {
            {1,2},
            {3,4}
        }
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

}

