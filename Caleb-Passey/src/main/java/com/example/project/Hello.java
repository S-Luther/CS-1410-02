package com.example.project;

public class Hello {

    static void print(String i){
        System.out.println(i);
    }
    public static void main(String[] args){
        String[] s = {"Hello World!"};
        print(s[0]);

        int[][] arr = {{1,2},{3,4}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

