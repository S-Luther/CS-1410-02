package com.example.project;
/*
 * @author Jacob Willoughby
 *
 */
public class Hello {

    public static void main (String[] args){
        int[][] array = {{1,2},{3,4}};
        for(int i = 0; i<2; i++){
            for(int j = 0;j<2; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
	
}

