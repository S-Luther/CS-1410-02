package com.example.project;

public class Hello {
    // you need to set equal to new int[2][2][2];
    //cool, also you should move it into the main method.
    //cool looks good
              
    
    public static void main(String[] args){
        String[] helloWorld = {"Hello World!"};

        System.out.Print(helloWorld[0]);
        int[][][] Nums = new int[2][2][2];
            for(int x = 0; x < 2; x++){
                int i = 1;
                for(int y = 0; y < 2; y++){
                    for(int z = 0; z < 2; z++){
                        Nums[x][y][z] = i;
                    }
                }
                i++;
            }
    }
}