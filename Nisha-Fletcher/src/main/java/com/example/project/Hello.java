package com.example.project;

public class Hello {

    public static void main(String[] args){
       int[][][] newarray = new int[2][2][2];
       int g = 1;
       for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
             for(int k = 0; k < 2; k++){
                newarray[k][j][i] = g++;
                }   
            }
       }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                for(int k = 0; k < 2; k++){
                System.out.print(" " + newarray[k][j][i]+" ");
                }
            }
       }
    }

}

