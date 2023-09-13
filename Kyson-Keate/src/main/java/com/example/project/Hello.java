package com.example.project;

public class Hello {
    public static void main(String[] args){
        
        int[][][] counting = new int[2][2][2];
        int number = 1;
        for(int i = 0; i < counting.length; i++){
            for(int j = 0; j < counting[i].length; j++){
                for(int k = 0; k < counting[i][j].length; k++){
                    counting[i][j][k] = number;
                    number++;
                } 
            }
        }
        for(int i = 0; i < counting.length; i++){
            for(int j = 0; j < counting[i].length; j++){
                for(int k = 0; k < counting[i][j].length; k++){
                    System.out.print(counting[i][j][k]);
                } 
            }
        }
    }

}

//perfect