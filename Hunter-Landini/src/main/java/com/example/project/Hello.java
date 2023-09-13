package com.example.project;

public class Hello {
    
                     
	public static void main(String[] args) {
        //this needs a size like = new int[2][2][2]
       int arr[][][] = new int[2][2][2];
       int temp = 1;
        //these need to be semi colons
        //I would recommend making a new int that just iterates up (temp++) each time you write a new value.
        //nice looks good
       for(int i = 0; i < 2; i++) {
        for(int j; j < 2; j++) {
            for(int k; k < 2; k++) {
                arr[i][j][k] = temp;
                temp++;
            }
        }
       }
        for(int i; i < 2; i++) {
            for(int j; j < 2; j++) {
                for(int k; k < 2; k++) {
                    System.out.print(arr[i][j][k]);
                }
            }
        }
    }
}

