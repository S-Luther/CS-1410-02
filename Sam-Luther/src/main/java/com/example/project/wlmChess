package com.example.project;







public class Hello {

    static String[][] Board = {
                                {"♖","♘","♗","♔","♕","♗","♘","♖"},
                                {"♙","♙","♙","♙","♙","♙","♙","♙"},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {"♟︎","♟︎","♟︎","♟︎","♟","♟︎","♟︎","♟︎"},
                                {"♜","♞","♝","♛","♚","♝","♞","♜"},
                              };

    public static void main(String[] args){
        boolean flipper = false;

        for(int i = 0; i<8; i++){
            for(int j=0; j<8; j++){
                if(Board[i][j] == null){
                    if(flipper){
                        System.out.print("||||");
                    }
                    else{
                        System.out.print("    ");
                    }
                }
                else{
                    if(flipper){
                        System.out.print("|"+Board[i][j]+"|");
                    }
                    else{
                        System.out.print(" "+Board[i][j]+" ");
                    }
                }
                flipper = !flipper;
            }
            flipper = !flipper;
            System.out.println();
        }
    }
}

