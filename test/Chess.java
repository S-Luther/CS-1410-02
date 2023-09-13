

public class Chess{

    static String[][][] moves = new String[400][8][8];

    static int movesIndex = 0;
    static int savedMoves = 1;



    static void move(String[][] board, int x1, int x2, int y1, int y2){
        board[y2][x2] = board[y1][x1];
        board[y1][x1] = null;
        for(int i =0; i<8;i++){
            for(int j =0; j<8; j++){
                moves[movesIndex][i][j] = board[i][j];
            }
        }
        movesIndex++;
        savedMoves++;
    }

    static String[][] Board =  {
                                    {"♖","♘","♗","♔","♕","♗","♘","♖"},
                                    {"♙","♙","♙","♙","♙","♙","♙","♙"},
                                    {null,null,null,null,null,null,null,null},
                                    {null,null,null,null,null,null,null,null},
                                    {null,null,null,null,null,null,null,null},
                                    {null,null,null,null,null,null,null,null},
                                    {"♟︎","♟︎","♟︎","♟︎","♟","♟︎","♟︎","♟︎"},
                                    {"♜","♞","♝","♛","♚","♝","♞","♜"}
                                };

    public static void main(String[] args){
        boolean flipper = false;

        for(int i =0; i<8;i++){
            for(int j =0; j<8; j++){
                moves[movesIndex][i][j] = Board[i][j];
            }
        }
        movesIndex++;

        move(Board, 1, 2, 0, 2);
        move(Board, 1, 1, 6, 4);
        move(Board, 2, 1, 2, 4);
        move(Board, 2, 0, 7, 5);
        move(Board, 4, 4, 1, 3);

        for(int k = 0; k<savedMoves; k++){
            
            for(int i =0; i<8;i++){

                for(int j =0; j<8; j++){
                    
                    if(moves[k][i][j] == null){
                        if(flipper){
                            System.out.print("████");
                        }
                        else{
                            System.out.print("    ");
                        }
                    }
                    else{
                        if(flipper){
                            System.out.print("█"+moves[k][i][j]+" █");
                        }
                        else{
                            System.out.print(" "+moves[k][i][j]+"  ");
                        }
                    }
                    flipper = !flipper;
                    
                }
                flipper = !flipper;
                System.out.println();
            }

            System.out.println();
            
        }
    }

}


//chcp 65001