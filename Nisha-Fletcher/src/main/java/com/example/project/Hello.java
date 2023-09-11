package com.example.project;

public class Hello {

    public static void main(String[] args){
        int[][] newarray = {{1,2},{3,4}};
        for(int i = 0; i<2; i++){
            System.out.print(newarray[0][i] + " ");
        }
        System.out.println();
        for(int i = 0; i<2; i++){
            System.out.print(newarray[1][i] + "");
        }
    }

}

