package com.example.project;


import java.util.ArrayList;
import java.util.Scanner;




public class Hello {

    static String[][] face =    {
                                    {"1","2","3"},
                                    {"4","5","6"},
                                    {"7","8","9"},
                                };

    static void show(String[][] Face){
        for(String[] i: Face){
            for(String j: i){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void rotateFace(String[][] Face, boolean clockwise){
        String[][] tempFace = new String[3][3];

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                tempFace[i][j] = Face[i][j];
            }
        }

        if(!clockwise){
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    Face[i][j] = tempFace[j][i];
                }
            }

            String[] tempRow = new String[3];

            for(int k=0; k<3; k++){
                tempRow[k] = Face[0][k];
            }

            Face[0] = Face[2];
            Face[2] = tempRow;
           
        }
        else{

        }
    }


    public static void main(String[] args){
        show(face);
        System.out.println();
        System.out.println();

        rotateFace(face, false);

        show(face);
    }
}

