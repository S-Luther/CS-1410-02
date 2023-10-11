package com.example.project;


import java.util.ArrayList;
import java.util.Scanner;




public class Hello {

    static boolean proceed = true;

    static ArrayList <String> solutionStack = new ArrayList<>();




    static String[][] face =    {
                                    {"1","2","3"},
                                    {"4","5","6"},
                                    {"7","8","9"},
                                };

    static String[][][] cube = {
        {
            {"r","r","r"},
            {"r","r","r"},
            {"r","r","r"}
        },
        {
            {"b","b","b"},
            {"b","b","b"},
            {"b","b","b"}
        },
        {
            {"1y","2y","3y"},
            {"4y","5y","6y"},
            {"7y","8y","9y"}
        },
        {
            {"g","g","g"},
            {"g","g","g"},
            {"g","g","g"}
        },
        {
            {"1w","2w","3w"},
            {"4w","5w","6w"},
            {"7w","8w","9w"}
        },
        {
            {"o","o","o"},
            {"o","o","o"},
            {"o","o","o"}
        },
    };

    static class Pair<T>{

        T first;
        T second;

        public Pair(T firstElement, T secondElement){
            first = firstElement;
            second = secondElement;
        }

        public Pair<T> swap() {
            return new Pair(second, first);
        }
        
    }

    static void show(String[][] Face){
        for(String[] i: Face){
            for(String j: i){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void solve(){
        for(int i = solutionStack.size()-1; i>=0; i--){
            System.out.print(solutionStack.get(i) + " ");
            solutionStack.remove(i);
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
            rotateFace(face, false);
            rotateFace(face, false);
            rotateFace(face, false);
        }
    }

    static void move(String[][][] Cube, String input){
        switch(input.toUpperCase()){
            case "U":
                solutionStack.add("U'");
                break;
            case "D":
                solutionStack.add("D'");
                break;
            case "R":
                solutionStack.add("R'");
                break;
            case "L":
                solutionStack.add("L'");
                break;
            case "F":
                solutionStack.add("F'");
                break;
            case "B":
                solutionStack.add("B'");
                break;
            case "Q":
                proceed = false;
                break;
        }
    }

    public static void main(String[] args){

        int argsLength = args.length;

        if(args.length > 0){

            for(int i = 0; i<argsLength; i++){
                move(cube, args[i]);
            }

        }

        Scanner input = new Scanner(System.in);


        while(proceed){
            System.out.println("Running");
            move(cube, input.next());
        }

        solve();


        // Pair<String[]> pair1 = new Pair<String[]>(cube[0][0], cube[1][0]);
        
        // cube[0][0] = pair1.swap().first;
        // cube[1][0] = pair1.swap().second;

        // Pair<String[]> pair2 = new Pair<String[]>(cube[0][0], cube[5][0]);
        
        // cube[0][0] = pair2.swap().first;
        // cube[5][0] = pair2.swap().second;

        // Pair<String[]> pair3 = new Pair<String[]>(cube[0][0], cube[3][0]);
        
        // cube[0][0] = pair3.swap().first;
        // cube[3][0] = pair3.swap().second;

        // for(int i = 0; i<6; i++){
        //     show(cube[i]);
        //     System.out.println();
        // }
        
        



    }
}

