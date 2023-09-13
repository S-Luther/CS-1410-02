package com.example.project;

public class Hello {

	public static void main(String[] args){
        int a=1;
        int[][][] arr = new int[2][2][2];
        for (int i =0; i<2; i++){
            for (int j =0; j<2; j++){
                for (int k =0; k<2; k++){
                    arr[i][j][k]=a;
                    System.out.print(a + " ");
                    a++;
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
// does it run right?
// a couple more changes need to be made it looks like.