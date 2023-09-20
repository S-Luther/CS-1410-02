package com.example.project;
/*
 * @author Jacob Willoughby
 *
 */
public class ArrayPrac {

    public static void main (String[] args){
        int[][][] array = new int[2][2][2];
        int count = 1;
        for(int i = 0; i<2; i++){
            for(int j = 0;j<2; j++){
                for(int k = 0;k<2; k++){
                    array[i][j][k] = count;
                    count++;
                }
            }
          
        }
        for(int i = 0; i<2; i++){
            for(int j = 0;j<2; j++){
                for(int k = 0;k<2; k++){
                    System.out.print(array[i][j][k]);
                }
            
            }
        
        }
    }
	
}

//perfect