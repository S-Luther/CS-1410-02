package com.example.project;
public class Hello{

public static void main(String[] args){
 
int [][] a = {
{1, 2},
{3, 4}
};

 for(int i = 0; i <2; i++){
        for(int j = 0; j <2; j++){
                System.out.print(a[i][j]+ "");
        }
        System.out.println();
 }


 
 /*
    boolean flipper = false

    for(int i = 0; i <8; i++){
        for(int j = 0; j <8; j++){
            if (Board[i][j]==null){
                if(flipper){
                    System.out.print("||"+ Board[i][j]+ "||");
                } 
                else{
                System.out.print("    ");
                }
            flipper = !flipper
            }
    System.out.println();
    flipper = !flipper

    }
    */

}

/*
public class Hello {
static String [][] Board = {
                                {"R","H","B","K","Q","B","H","R"},
                                {"P","P","P","P","P","P","P","P"},
                                {null, null, null, null, null, null, null, null, },
                                {null, null, null, null, null, null, null, null, },
                                {null, null, null, null, null, null, null, null, },
                                {null, null, null, null, null, null, null, null, },
                                {"P","P","P","P","P","P","P","P"},
                                {"R","H","B","Q","K","B","H","R"},

                            };

}
*/
}